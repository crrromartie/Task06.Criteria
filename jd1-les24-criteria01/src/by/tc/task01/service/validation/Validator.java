package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		if (criteria.getGroupSearchName().compareTo("Oven") == 0) {

			int counter = 0;

			for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {

				String c = item.getValue().toString().trim();
				char[] x = c.toCharArray();

				for (char r : x) {

					if (!Character.isDigit(r)) {
						counter++;
					}
				}

				if (counter != 0) {

					return false;

				}
			}

		}

		if (criteria.getGroupSearchName().compareTo("Laptop") == 0) {

			int counter = 0;

			for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {

				if (item.getKey().toString().compareTo(SearchCriteria.Laptop.OS.toString()) == 0
						|| item.getKey().toString().compareTo(SearchCriteria.Laptop.CPU.toString()) == 0) {

				} else {

					String c = item.getValue().toString().trim();
					char[] x = c.toCharArray();

					for (char r : x) {

						if (!Character.isDigit(r)) {

							counter++;

						}

					}

				}

				if (counter != 0) {

					return false;

				}
			}

		}

		if (criteria.getGroupSearchName().compareTo("Refrigerator") == 0) {

			int counter = 0;

			for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {

				String c = item.getValue().toString().trim();
				char[] x = c.toCharArray();

				for (char r : x) {

					if (!Character.isDigit(r)) {

						counter++;

					}

				}

				if (counter != 0) {

					return false;

				}
			}

		}

		if (criteria.getGroupSearchName().compareTo("Speakers") == 0) {

			int counter = 0;

			for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {

				if (item.getKey().toString().compareTo(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()) == 0) {

				} else {

					String c = item.getValue().toString().trim();
					char[] x = c.toCharArray();

					for (char r : x) {

						if (!Character.isDigit(r)) {

							counter++;

						}

					}

				}

				if (counter != 0) {

					return false;

				}
			}

		}

		if (criteria.getGroupSearchName().compareTo("TabletPC") == 0) {

			int counter = 0;

			for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {

				if (item.getKey().toString().compareTo(SearchCriteria.TabletPC.COLOR.toString()) == 0) {

				} else {

					String c = item.getValue().toString().trim();
					char[] x = c.toCharArray();

					for (char r : x) {

						if (!Character.isDigit(r)) {

							counter++;

						}

					}

				}

				if (counter != 0) {

					return false;

				}
			}

		}

		if (criteria.getGroupSearchName().compareTo("VacuumCleaner") == 0) {

			int counter = 0;

			for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {

				if (item.getKey().toString().compareTo(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()) == 0
						|| item.getKey().toString().compareTo(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()) == 0
						|| item.getKey().toString().compareTo(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()) == 0) {

				} else {

					String c = item.getValue().toString().trim();
					char[] x = c.toCharArray();

					for (char r : x) {

						if (!Character.isDigit(r)) {

							counter++;

						}

					}

				}

				if (counter != 0) {

					return false;

				}
			}

		}

		return true;

	}

}
