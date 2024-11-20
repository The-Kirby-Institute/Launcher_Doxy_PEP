package sim;

import java.io.IOException;

public class Launcher_Doxy_PEP {

	public static void main(String[] args) throws IOException, InterruptedException {
		final String USAGE_INFO = String.format(
				"Usage: java %s - PROP_FILE_DIRECTORY "
						+ "<-export_skip_backup> <-printProgress> <-seedMap=SEED_MAP>\n",
				Launcher_Doxy_PEP.class.getName());
		if (args.length < 1) {
			System.out.println(USAGE_INFO);
			System.exit(0);
		} else {
			Simulation_ClusterModelTransmission.launch(args);
		}
	}

}
