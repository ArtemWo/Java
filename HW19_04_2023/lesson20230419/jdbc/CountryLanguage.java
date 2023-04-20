package HW19_04_2023.lesson20230419.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CountryLanguage{
	private String countryCode;
	private String language;
	private String isOfficial;
	private float percentage;


}

