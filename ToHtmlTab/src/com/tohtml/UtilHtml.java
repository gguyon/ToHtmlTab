package com.tohtml;

public class UtilHtml {

	private String arg[] = null;

	/**
	 * 
	 * @param tab
	 *            le tableau
	 * @param maxRows
	 *            le nombre maximum de lignes souhait� (doit �tre >= 0)
	 * @return Si le tableau est vide, la m�thode retourne la chaine "(vide)" si
	 *         le tableau contient moins de maxRows lignes, le deuxième
	 *         paramètre). Il y a autant de
	 *         <tr>
	 *         que d'�l�ments dans le tableau� concurrence de maxRows lignes
	 *         s'il le nombre d'�ments dans le tableau est supérieur à
	 *         maxRows, la dernière ligne sera définie par "..."
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
