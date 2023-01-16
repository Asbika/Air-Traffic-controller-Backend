package org.sid.airtrafficcontrolbackend;

import org.sid.airtrafficcontrolbackend.dtos.AeroportDto;
import org.sid.airtrafficcontrolbackend.entities.*;
import org.sid.airtrafficcontrolbackend.enums.TypeAvion;
import org.sid.airtrafficcontrolbackend.mappers.AeroportMapperImpl;
import org.sid.airtrafficcontrolbackend.repositories.*;
import org.sid.airtrafficcontrolbackend.services.AeroportServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class AirTrafficControlBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirTrafficControlBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner start(AeroportMapperImpl aeroportMapperImpl,AeroportServiceImpl a,AeroportRepository aeroportRepository, AvionRepository avionRepository, CarteRepository carteRepository, PerturbationRepository perturbationRepository, PositionRepository positionRepository, TrajetRepository trajetRepository, VolRepository volRepository) {

		return args -> {
			// liste aeroport depart Perth
			AeroportDto aeroportDepart3 = new AeroportDto();
			aeroportDepart3.setNomAeroport("Perth");
			aeroportDepart3.setNbrPistes(5);
			aeroportDepart3.setNbrPlaceAuSol(12);
			aeroportDepart3.setTempAtenteAuSol(6);
			aeroportDepart3.setTempAcceAuxPistes(2);
			aeroportDepart3.setTempDecolageAtterissage(2);
			aeroportDepart3.setDelaiAntiCollision(1);
			aeroportDepart3.setDureeBoucleDAttentEnVol(2);

			aeroportDepart3.setAxeX(-31.95);
			aeroportDepart3.setAxeY(115.85);
			ArrayList<Integer> listAero = new ArrayList();
			aeroportDepart3.setListeAeroport(listAero);
			a.addAeroports(aeroportDepart3);

			//aeroport arriver Paris
			AeroportDto aeroportArriver = new AeroportDto();
			aeroportArriver.setNomAeroport("Paris");
			aeroportArriver.setNbrPistes(3);
			aeroportArriver.setNbrPlaceAuSol(10);
			aeroportArriver.setTempAtenteAuSol(6);
			aeroportArriver.setTempAcceAuxPistes(3);
			aeroportArriver.setTempDecolageAtterissage(4);
			aeroportArriver.setDelaiAntiCollision(1);
			aeroportArriver.setDureeBoucleDAttentEnVol(4);
			aeroportArriver.setAxeX(48.86);
			aeroportArriver.setAxeY(2.33);
			ArrayList<Integer> integerListe = new ArrayList<>();
			integerListe.add(1);
			aeroportArriver.setListeAeroport(integerListe);
			a.addAeroports(aeroportArriver);

			//Aeroport Depart Haiti
			AeroportDto aeroportDepart2 = new AeroportDto();
			aeroportDepart2.setNomAeroport("Haiti");
			aeroportDepart2.setNbrPistes(1);
			aeroportDepart2.setNbrPlaceAuSol(4);
			aeroportDepart2.setTempAtenteAuSol(8);
			aeroportDepart2.setTempAcceAuxPistes(2);
			aeroportDepart2.setTempDecolageAtterissage(2);
			aeroportDepart2.setDelaiAntiCollision(1);
			aeroportDepart2.setDureeBoucleDAttentEnVol(4);

			aeroportDepart2.setAxeX(19.05);
			aeroportDepart2.setAxeY(-73.04);

			ArrayList<Integer> listAero1 = new ArrayList();
			listAero1.add(1);
			listAero1.add(2);
			aeroportDepart2.setListeAeroport(listAero1);
			a.addAeroports(aeroportDepart2);

			// liste aeroport depart New York
			AeroportDto aeroportDepart = new AeroportDto();
			aeroportDepart.setNomAeroport("New York");
			aeroportDepart.setNbrPistes(5);
			aeroportDepart.setNbrPlaceAuSol(12);
			aeroportDepart.setTempAtenteAuSol(3);
			aeroportDepart.setTempAcceAuxPistes(3);
			aeroportDepart.setTempDecolageAtterissage(3);
			aeroportDepart.setDelaiAntiCollision(1);
			aeroportDepart.setDureeBoucleDAttentEnVol(5);

			aeroportDepart.setAxeX(40.73);
			aeroportDepart.setAxeY(-73.93);

			ArrayList<Integer> listAero2 = new ArrayList();
			listAero2.add(1);
			listAero2.add(2);
			listAero2.add(3);

			aeroportDepart.setListeAeroport(listAero2);
			a.addAeroports(aeroportDepart);

			// liste aeroport depart Cape Town
			AeroportDto aeroportDepart4 = new AeroportDto();
			aeroportDepart4.setNomAeroport("Cape Town");
			aeroportDepart4.setNbrPistes(2);
			aeroportDepart4.setNbrPlaceAuSol(6);
			aeroportDepart4.setTempAtenteAuSol(8);
			aeroportDepart4.setTempAcceAuxPistes(4);
			aeroportDepart4.setTempDecolageAtterissage(3);
			aeroportDepart4.setDelaiAntiCollision(1);
			aeroportDepart4.setDureeBoucleDAttentEnVol(2);

			aeroportDepart4.setAxeX(-33.91);
			aeroportDepart4.setAxeY(18.42);

			ArrayList<Integer> listAero3 = new ArrayList();
			listAero3.add(2);
			listAero3.add(4);
			aeroportDepart4.setListeAeroport(listAero3);
			a.addAeroports(aeroportDepart4);

			// liste aeroport depart La Paze
			AeroportDto aeroportDepart5 = new AeroportDto();
			aeroportDepart5.setNomAeroport("La Paze");
			aeroportDepart5.setNbrPistes(1);
			aeroportDepart5.setNbrPlaceAuSol(6);
			aeroportDepart5.setTempAtenteAuSol(6);
			aeroportDepart5.setTempAcceAuxPistes(1);
			aeroportDepart5.setTempDecolageAtterissage(1);
			aeroportDepart5.setDelaiAntiCollision(1);
			aeroportDepart5.setDureeBoucleDAttentEnVol(3);

			aeroportDepart5.setAxeX(-16.48);
			aeroportDepart5.setAxeY(-68.11);

			ArrayList<Integer> listAero4 = new ArrayList();
			listAero4.add(5);
			aeroportDepart5.setListeAeroport(listAero4);
			a.addAeroports(aeroportDepart5);

			// liste aeroport depart Bankok
			AeroportDto aeroportDepart6 = new AeroportDto();
			aeroportDepart6.setNomAeroport("Bankok");
			aeroportDepart6.setNbrPistes(1);
			aeroportDepart6.setNbrPlaceAuSol(6);
			aeroportDepart6.setTempAtenteAuSol(6);
			aeroportDepart6.setTempAcceAuxPistes(1);
			aeroportDepart6.setTempDecolageAtterissage(1);
			aeroportDepart6.setDelaiAntiCollision(1);
			aeroportDepart6.setDureeBoucleDAttentEnVol(3);

			aeroportDepart6.setAxeX(13.73);
			aeroportDepart6.setAxeY(100.52);

			ArrayList<Integer> listAero5 = new ArrayList();
			listAero5.add(6);
			listAero5.add(5);
			listAero5.add(2);

			aeroportDepart6.setListeAeroport(listAero5);
			a.addAeroports(aeroportDepart6);

		//Plane Creation	Plane-1
			Avion avion1 = new Avion();
			avion1.setTypeAvion(TypeAvion.LONG);
			avion1.setConsommation(100);
			avion1.setCapaciteCarburant(200);

			Avion avion2 = new Avion();
			avion2.setTypeAvion(TypeAvion.COURT);
			avion2.setConsommation(60);
			avion2.setCapaciteCarburant(100);

		//Plane Creation Plane-3
			Avion avion3 = new Avion();
			avion3.setTypeAvion(TypeAvion.MOYEN);
			avion3.setConsommation(80);
			avion3.setCapaciteCarburant(150);

		//Plane Creation Plane-4
			Avion avion4 = new Avion();
			avion4.setTypeAvion(TypeAvion.LONG);
			avion4.setConsommation(120);
			avion4.setCapaciteCarburant(1000);

			avionRepository.save(avion1);
			avionRepository.save(avion2);
			avionRepository.save(avion3);
			avionRepository.save(avion4);
		// end of plane creation :---------------------------------------------------
		// flight Creation :---------------------------------------------------------
			Vol vol1 = new Vol();
			vol1.setAvion(avion1);
			Trajet trajet1 = a.getTrajetById(10);
			vol1.setTrajet(trajet1);
			vol1.setHeureDepart(9);
			volRepository.save(vol1);

			Vol vol2 = new Vol();
			vol2.setAvion(avion2);
			Trajet trajet2 = a.getTrajetById(4);
			vol2.setTrajet(trajet2);
			vol2.setHeureDepart(7);
			volRepository.save(vol2);

			Vol vol3 = new Vol();
			vol3.setAvion(avion3);
			Trajet trajet3 = a.getTrajetById(8);
			vol3.setTrajet(trajet3);
			vol3.setHeureDepart(5);
			volRepository.save(vol3);

			Vol vol4 = new Vol();
			vol4.setAvion(avion3);
			Trajet trajet4 = a.getTrajetById(3);
			vol4.setTrajet(trajet4);
			vol4.setHeureDepart(1);
			volRepository.save(vol4);;

		// end of flight creation :---------------------------------------------------------------
		};
	}
}

