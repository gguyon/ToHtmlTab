package com.tohtml;

public class UtilHtml {

	private String arg[] = null;

	/**
	 * 
	 * @param tab
	 *            le tableau
	 * @param maxRows
	 *            le nombre maximum de lignes souhaitÈ (doit Ítre >= 0)
	 * @return Si le tableau est vide, la mÈthode retourne la chaine "(vide)" si
	 *         le tableau contient moins de maxRows lignes, le deuxi√®me
	 *         param√®tre). Il y a autant de
	 *         <tr>
	 *         que d'ÈlÈments dans le tableau‡† concurrence de maxRows lignes
	 *         s'il le nombre d'Èments dans le tableau est sup√©rieur √†
	 *         maxRows, la derni√®re ligne sera d√©finie par "..."
	 */
	public String toHtmlTab(Object[] tab, int maxRows) {
		maxRows = (int) maxRows;
		String chaineReturn = null;
		if (tab.length == 0) {
			chaineReturn = "(vide)";
		} else {
			chaineReturn = "<table>";

			for (int i = 0; i < tab.length && i < maxRows; i++) {
				chaineReturn += "<tr><td>" + tab[i] + "</td></tr>";
			}
			if (tab.length > maxRows) {
				chaineReturn += "<tr><td>...</td></tr>";
			}
			chaineReturn += "</table>";
		}
		return chaineReturn;
	}
}
