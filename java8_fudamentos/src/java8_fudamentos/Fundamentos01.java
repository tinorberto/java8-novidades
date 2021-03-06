package java8_fudamentos;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Fundamentos01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Tiago", "Norberto");
		Person p2 = new Person("Ariane", "Fernandes");
		Person p3 = new Person("Vinicios", "Araujo");
		//Person p4 = new Person(null, "Araujo");

	 	//List<Person> persons = Arrays.asList(p, p2, p3, null);
		List<Person> persons = Arrays.asList(p, p2, p3);


		// impressao  [java8_fudamentos.Person@f3d8d765, java8_fudamentos.Person@d45d9aa, java8_fudamentos.Person@aabb476]
		System.out.println(persons);

		// Fazer o for para a impressao
		//persons.stream().forEach(System.out::println);


		// Filtrar os valores nulos
		persons.stream().filter(Objects::nonNull).filter(s -> s.getFirstName().startsWith("A")).forEach(System.out::println);

		//Fazer o mapeamento de primerio nome
		persons.stream().map(Person::getFirstName).forEach(System.out::println);


	}

}
