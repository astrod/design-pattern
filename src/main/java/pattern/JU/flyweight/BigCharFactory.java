package pattern.JU.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * BigCharFactory
 *
 * @author jongUn
 * @since 2017. 05. 07.
 */
public class BigCharFactory {
	private Map<String, BigChar> pool = new HashMap<>();
	private static BigCharFactory singleton = new BigCharFactory();

	private BigCharFactory() {

	}

	public static BigCharFactory newInstance() {
		return singleton;
	}

	public synchronized BigChar getBigChar(char charName) {
		BigChar bc = pool.get("" + charName);
		if (bc == null) {
			bc = new BigChar(charName);
			pool.put("" + charName, bc);
		}

		return bc;
	}

	public BigChar getBigCharWithoutSync(char charName) {
		BigChar bc = pool.get("" + charName);
		if (bc == null) {
			System.out.println("bc is null. charName is : " + charName);
			bc = new BigChar(charName);
			pool.put("" + charName, bc);
		}

		return bc;
	}
}
