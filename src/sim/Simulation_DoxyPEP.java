package sim;

import java.io.IOException;
import java.util.Properties;

public class Simulation_DoxyPEP extends Simulation_ClusterModelTransmission {	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		final String USAGE_INFO = String.format(
				"Usage: java %s - PROP_FILE_DIRECTORY "
						+ "<-export_skip_backup> <-printProgress> <-seedMap=SEED_MAP>\n",
						Simulation_DoxyPEP.class.getName());
		if (args.length < 1) {
			System.out.println(USAGE_INFO);
			System.exit(0);
		} else {
			Simulation_ClusterModelTransmission.launch(args, new Simulation_DoxyPEP());
		}
	}
	
	
	@Override
	public Abstract_Runnable_ClusterModel_Transmission generateDefaultRunnable(long cMap_seed, long sim_seed, 
			Properties loaProperties) {				
		return new Runnable_ClusterModel_Prophylaxis(cMap_seed, sim_seed,
				baseContactMapMapping.get(cMap_seed), loadedProperties);
	}
	

}
