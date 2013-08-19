package org.lemsml.export.base;

/**
 * @author matteocantarelli
 *
 */
public class Utils
{

	public static String getHeaderComment(String format)
	{
		String commentString = "    This " + format + " file has been generated by org.lemsml.export \n" + "         jLEMS               v" + org.lemsml.jlems.io.Main.VERSION;
		return commentString;
	}

}