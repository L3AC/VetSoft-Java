import com.formdev.flatlaf.FlatLightLaf;

public class j
	extends FlatLightLaf
{
	public static final String NAME = "j";

	public static boolean setup() {
		return setup( new j() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, j.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
