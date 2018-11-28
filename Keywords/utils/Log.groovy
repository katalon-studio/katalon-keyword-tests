package utils

import com.kms.katalon.core.util.KeywordUtil

public class Log {
	private static KeywordUtil logger = new KeywordUtil();

	public static void logInfo(String message) {
		logger.logInfo(message);
	}

	public static void logError(String message) {
		logger.markError(message);
	}
}
