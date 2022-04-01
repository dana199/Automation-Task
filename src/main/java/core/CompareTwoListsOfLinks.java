package core;

import java.util.List;

public class CompareTwoListsOfLinks
{
	public static void compareTwoListsOfLinkes(List<String> LinkedInLinkes, List<String> GoogleLinks) {

		for (int i = 0; i < LinkedInLinkes.size(); i++) {
			for (int j = 0; j <  GoogleLinks.size(); j++) {

				if (LinkedInLinkes.equals( GoogleLinks) == true) {
					System.out.println(" Array List are equal");
				} else {
					System.out.println(" Array List are not equal");
				}

			}
		}
	}

}
