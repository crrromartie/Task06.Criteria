package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.view.PrintApplianceInfo;

public class Main {

	public static void main(String[] args) {

		List<? extends Appliance> appliance = null;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.CAPACITY.toString(), 700);

		try {

			appliance = service.find(criteriaOven);

		} catch (ServiceException e) {

			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);
		System.out.println();

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 45);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		try {
			appliance = service.find(criteriaOven);
		} catch (ServiceException e) {

			e.printStackTrace();

		}

		PrintApplianceInfo.print(appliance);
		System.out.println();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
		criteriaLaptop.add(Laptop.OS.toString().toString(), "Windows");
		criteriaLaptop.add(Laptop.CPU.toString().toString(), 1.2);
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY.toString().toString(), 1);

		try {
			appliance = service.find(criteriaLaptop);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);
		System.out.println();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY.toString(), 15);
		criteriaRefrigerator.add(Refrigerator.WEIGHT.toString().toString(), 30);

		try {
			appliance = service.find(criteriaRefrigerator);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);
		System.out.println();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaSpearers = new Criteria(Speakers.class.getSimpleName());
		criteriaSpearers.add(Speakers.POWER_CONSUMPTION.toString(), 20);

		try {
			appliance = service.find(criteriaSpearers);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);
		System.out.println();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE.toString(), "XX00");

		try {
			appliance = service.find(criteriaVacuumCleaner);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);
		System.out.println();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "red");

		try {
			appliance = service.find(criteriaTabletPC);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);
		System.out.println();

	}

}
