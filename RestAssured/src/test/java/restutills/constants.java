package restutills;

public class constants {


		
			String generatedString = RandomStringUtils.randomAlphabetic(1);
		
			String generatedString = RandomStringUtils.randomAlphabetic(1);
			
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return ("SELVI" + generatedString);
		}

		public static String getPassword() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return ("SELVI" + generatedString);
		}

		public static String getEmail() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return (generatedString + "@gamil.com");
		}

		public static String empName() {
			String generatedString = RandomStringUtils.randomAlphabetic(1);
			return ("SELVI" + generatedString);
		}

		public static String empSal() {
			String generatedString = RandomStringUtils.randomNumeric(5);
			return (generatedString);
		}

		public static String empAge() {
			String generatedString = RandomStringUtils.randomNumeric(2);
			return (generatedString);
		}
	}

}
