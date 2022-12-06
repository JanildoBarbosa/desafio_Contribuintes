package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nDigite os dados do %dº contribuinte: %n", i + 1);
			System.out.print("Renda anual com salário: ");
			double salary = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double prestacaoServicos = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double ganhoCapital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double gastosMedicos = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double gastosEducacionais = sc.nextDouble();
			
			list.add(new TaxPayer(salary, prestacaoServicos, ganhoCapital, gastosMedicos, gastosEducacionais));

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("\nResumo do %dº contribuinte: %n", i+1);
			System.out.println(list.get(i).toString());
		}

		sc.close();

	}

}
