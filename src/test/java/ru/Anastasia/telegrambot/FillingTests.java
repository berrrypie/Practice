package ru.Anastasia.telegrambot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import ru.Anastasia.telegrambot.entities.Category;
import ru.Anastasia.telegrambot.entities.Product;
import ru.Anastasia.telegrambot.repositories.CategoryRepository;
import ru.Anastasia.telegrambot.repositories.ProductRepository;

@SpringBootTest
 class FillingTests {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    @Test
    void Task3(){

        // Основные категории

        Category mainCategoryPizza = new Category();
        mainCategoryPizza.setName("Пицца");
        categoryRepository.save(mainCategoryPizza);

        Category mainCategorySushi = new Category();
        mainCategorySushi.setName("Роллы");
        categoryRepository.save(mainCategorySushi);

        Category mainCategoryBurgers = new Category();
        mainCategoryBurgers.setName("Бургеры");
        categoryRepository.save(mainCategoryBurgers);

        Category mainCategoryDrinks = new Category();
        mainCategoryDrinks.setName("Напитки");
        categoryRepository.save(mainCategoryDrinks);

        // Подкатегории Роллы (буква в конце - сокращенние, первая буква основной категории)

        Category subCategoryS1 = new Category();
        subCategoryS1.setName("Классические роллы");
        subCategoryS1.setParent(mainCategorySushi);
        categoryRepository.save(subCategoryS1);

        Category subCategoryS2 = new Category();
        subCategoryS2.setName("Запеченные роллы");
        subCategoryS2.setParent(mainCategorySushi);
        categoryRepository.save(subCategoryS2);

        Category subCategoryS3 = new Category();
        subCategoryS3.setName("Сладкие роллы");
        subCategoryS3.setParent(mainCategorySushi);
        categoryRepository.save(subCategoryS3);

        Category subCategoryS4 = new Category();
        subCategoryS4.setName("Наборы");
        subCategoryS4.setParent(mainCategorySushi);
        categoryRepository.save(subCategoryS4);

        // Подкатегории Бургеры

        Category subCategoryB1 = new Category();
        subCategoryB1.setName("Классические бургеры");
        subCategoryB1.setParent(mainCategoryBurgers);
        categoryRepository.save(subCategoryB1);

        Category subCategoryB2 = new Category();
        subCategoryB2.setName("Острые бургеры");
        subCategoryB2.setParent(mainCategoryBurgers);
        categoryRepository.save(subCategoryB2);

        // Подкатегории напитки

        Category subCategoryD1 = new Category();
        subCategoryD1.setName("Газированные напитки");
        subCategoryD1.setParent(mainCategoryDrinks);
        categoryRepository.save(subCategoryD1);

        Category subCategoryD2 = new Category();
        subCategoryD2.setName("Энергетические напитки");
        subCategoryD2.setParent(mainCategoryDrinks);
        categoryRepository.save(subCategoryD2);

        Category subCategoryD3 = new Category();
        subCategoryD3.setName("Соки");
        subCategoryD3.setParent(mainCategoryDrinks);
        categoryRepository.save(subCategoryD3);

        Category subCategoryD4 = new Category();
        subCategoryD4.setName("Другие");
        subCategoryD4.setParent(mainCategoryDrinks);
        categoryRepository.save(subCategoryD4);

        // Товары категории пицца

        Product pizza_1 = new Product();
        pizza_1.setCategory(subCategoryS1);
        pizza_1.setName("Пепперони");
        pizza_1.setDescription("Сыр, копченые колбаски, томатный соус");
        pizza_1.setPrice(350.00);
        productRepository.save(pizza_1);

        Product pizza_2 = new Product();
        pizza_2.setCategory(subCategoryS1);
        pizza_2.setName("Авторская");
        pizza_2.setDescription("Грибы, помидоры, оливки, сыр, ветчина");
        pizza_2.setPrice(500.00);
        productRepository.save(pizza_2);

        Product pizza_3 = new Product();
        pizza_3.setCategory(subCategoryS1);
        pizza_3.setName("Вегетерианская");
        pizza_3.setDescription("Грибы, помидоры, болгарский перец, соус ореховый");
        pizza_3.setPrice(350.00);
        productRepository.save(pizza_3);


        // Товары категории роллы
        // Товары подкатегории Классические роллы

        Product classical_sushi_1 = new Product();
        classical_sushi_1.setCategory(subCategoryS1);
        classical_sushi_1.setName("Филадельфия");
        classical_sushi_1.setDescription("Лосось, крем чиз, рис, нори");
        classical_sushi_1.setPrice(450.99);
        productRepository.save(classical_sushi_1);

        Product classical_sushi_2 = new Product();
        classical_sushi_2.setCategory(subCategoryS1);
        classical_sushi_2.setName("Калифорния");
        classical_sushi_2.setDescription("Икра, угорь, крем чиз, рис, нори");
        classical_sushi_2.setPrice(399.99);
        productRepository.save(classical_sushi_2);

        Product classical_sushi_3 = new Product();
        classical_sushi_3.setCategory(subCategoryS1);
        classical_sushi_3.setName("Калифорния креветка");
        classical_sushi_3.setDescription("Лосось,креветка, крем чиз, рис, нори");
        classical_sushi_3.setPrice(550.00);
        productRepository.save(classical_sushi_3);

        // Товары подкатегории запеченные роллы

        Product hot_sushi_1 = new Product();
        hot_sushi_1.setCategory(subCategoryS2);
        hot_sushi_1.setName("Ямми");
        hot_sushi_1.setDescription("Угорь, сырная шапка, рис, нори");
        hot_sushi_1.setPrice(300.99);
        productRepository.save(hot_sushi_1);

        Product hot_sushi_2 = new Product();
        hot_sushi_2.setCategory(subCategoryS2);
        hot_sushi_2.setName("Темпура");
        hot_sushi_2.setDescription("Креветка, крем чиз, рис, нори");
        hot_sushi_2.setPrice(400.50);
        productRepository.save(hot_sushi_2);

        Product hot_sushi_3 = new Product();
        hot_sushi_3.setCategory(subCategoryS2);
        hot_sushi_3.setName("Огонек");
        hot_sushi_3.setDescription("Сырная шапка, мидия, крем чиз, рис, нори");
        hot_sushi_3.setPrice(300.00);
        productRepository.save(hot_sushi_3);

        // Товары подкатегории сладкие роллы

        Product sweet_sushi_1 = new Product();
        sweet_sushi_1.setCategory(subCategoryS3);
        sweet_sushi_1.setName("Для нее");
        sweet_sushi_1.setDescription("Клубника, крем чиз, белый шоколад");
        sweet_sushi_1.setPrice(250.99);
        productRepository.save(sweet_sushi_1);

        Product sweet_sushi_2 = new Product();
        sweet_sushi_2.setCategory(subCategoryS3);
        sweet_sushi_2.setName("Для него");
        sweet_sushi_2.setDescription("Смородиновый джем, крем чиз, темный шоколад");
        sweet_sushi_2.setPrice(249.99);
        productRepository.save(sweet_sushi_2);

        Product sweet_sushi_3 = new Product();
        sweet_sushi_3.setCategory(subCategoryS3);
        sweet_sushi_3.setName("Пахлава");
        sweet_sushi_3.setDescription("Мед, тесто, грецкие орехи ");
        sweet_sushi_3.setPrice(300.00);
        productRepository.save(sweet_sushi_3);

        // Товары подкатегории наборы роллов

        Product set_sushi_1 = new Product();
        set_sushi_1.setCategory(subCategoryS4);
        set_sushi_1.setName("Отпуск в Америке");
        set_sushi_1.setDescription("Ролл Филадельфия, ролл Калифорния");
        set_sushi_1.setPrice(850.99);
        productRepository.save(set_sushi_1);

        Product set_sushi_2 = new Product();
        set_sushi_2.setCategory(subCategoryS4);
        set_sushi_2.setName("Романтический вечер");
        set_sushi_2.setDescription("Сладкие роллы для него и для нее");
        set_sushi_2.setPrice(500.00);
        productRepository.save(set_sushi_2);

        Product set_sushi_3 = new Product();
        set_sushi_3.setCategory(subCategoryS4);
        set_sushi_3.setName("Горячий сет");
        set_sushi_3.setDescription("Ролл Темпура, ролл Огонек");
        set_sushi_3.setPrice(700.99);
        productRepository.save(set_sushi_3);

        // Товары категории бургеры
        // Товары подкатегории Классические бургеры

        Product classical_burger_1 = new Product();
        classical_burger_1.setCategory(subCategoryB1);
        classical_burger_1.setName("Чизбургер");
        classical_burger_1.setDescription("Говяжья котлета, сыр чеддер, салат, соус");
        classical_burger_1.setPrice(300.00);
        productRepository.save(classical_burger_1);

        Product classical_burger_2 = new Product();
        classical_burger_2.setCategory(subCategoryB1);
        classical_burger_2.setName("ШефБургер");
        classical_burger_2.setDescription("Свиная котлета, сыр чеддер, помидор, огурец, салат, соус от шефа");
        classical_burger_2.setPrice(400.00);
        productRepository.save(classical_burger_2);

        Product classical_burger_3 = new Product();
        classical_burger_3.setCategory(subCategoryB1);
        classical_burger_3.setName("Детский");
        classical_burger_3.setDescription("Куриная котлетка, помидорка, салатик, огурчик, соусик ");
        classical_burger_3.setPrice(250.15);
        productRepository.save(classical_burger_3);

        // Товары подкатегории Острые бургеры

        Product spicy_burger_1 = new Product();
        spicy_burger_1.setCategory(subCategoryB2);
        spicy_burger_1.setName("Дьябло");
        spicy_burger_1.setDescription("Говяжья котлета, сыр чеддер, салат, острый соус");
        spicy_burger_1.setPrice(470.99);
        productRepository.save(spicy_burger_1);

        Product spicy_burger_2 = new Product();
        spicy_burger_2.setCategory(subCategoryB2);
        spicy_burger_2.setName("Шеф с огнеметом");
        spicy_burger_2.setDescription("Свиная котлета, сыр чеддер, помидор, огурец, салат, халапеньо, острый соус от шефа");
        spicy_burger_2.setPrice(459.99);
        productRepository.save(spicy_burger_2);

        Product spicy_burger_3 = new Product();
        spicy_burger_3.setCategory(subCategoryB2);
        spicy_burger_3.setName("Держись, брат");
        spicy_burger_3.setDescription("Говяжья котлета, сыр чеддер, салат, халапеньо, острый соус, красный и черный перец\n" +
                " p.s. Если съешь полностью - бургер за наш счет");
        spicy_burger_3.setPrice(599.99);
        productRepository.save(spicy_burger_3);

        // Товары категории Напитки
        // Товары подкатегории Газированная вода

        Product soda_1 = new Product();
        soda_1.setCategory(subCategoryD1);
        soda_1.setName("Спрайт");
        soda_1.setDescription("1 литр");
        soda_1.setPrice(150.00);
        productRepository.save(soda_1);

        Product soda_2 = new Product();
        soda_2.setCategory(subCategoryD1);
        soda_2.setName("Пепси");
        soda_2.setDescription("1 литр");
        soda_2.setPrice(170.00);
        productRepository.save(soda_2);

        Product soda_3 = new Product();
        soda_3.setCategory(subCategoryD1);
        soda_3.setName("Бонаква");
        soda_3.setDescription("1 литр");
        soda_3.setPrice(115.00);
        productRepository.save(soda_3);

        // Товары подкатегории Энергетические напитки

        Product tonic_1 = new Product();
        tonic_1.setCategory(subCategoryD2);
        tonic_1.setName("Ред булл");
        tonic_1.setDescription("Черника/Кокос-ягоды 0.3 л.");
        tonic_1.setPrice(170.00);
        productRepository.save(tonic_1);

        Product tonic_2 = new Product();
        tonic_2.setCategory(subCategoryD2);
        tonic_2.setName("Берн");
        tonic_2.setDescription("Классический 0.45 л.");
        tonic_2.setPrice(100.99);
        productRepository.save(tonic_2);

        Product tonic_3 = new Product();
        tonic_3.setCategory(subCategoryD2);
        tonic_3.setName("Торнадо");
        tonic_3.setDescription("Кокос/Малина/Кофе 0.45 л.");
        tonic_3.setPrice(90.00);
        productRepository.save(tonic_3);

        // Товары подкатегории Соки

        Product juice_1 = new Product();
        juice_1.setCategory(subCategoryD3);
        juice_1.setName("Добрый");
        juice_1.setDescription("Яблоко/Мультифрукт/Вишня/Апельсин 1 л.");
        juice_1.setPrice(150.99);
        productRepository.save(juice_1);

        Product juice_2 = new Product();
        juice_2.setCategory(subCategoryD3);
        juice_2.setName("Рич Бич");
        juice_2.setDescription("Яблоко/Мультифрукт/Вишня/Апельсин 1 л.");
        juice_2.setPrice(250.99);
        productRepository.save(juice_2);

        Product juice_3 = new Product();
        juice_3.setCategory(subCategoryD3);
        juice_3.setName("Недосок");
        juice_3.setDescription("Яблоко/Мультифрукт/Вишня/Апельсин 1 л.");
        juice_3.setPrice(59.99);
        productRepository.save(juice_3);

        // Товары подкатегории Другие

        Product beer = new Product();
        beer.setCategory(subCategoryD4);
        beer.setName("Пиво");
        beer.setDescription("Хугарден, Эдельвейс, Кроненберг 1664 0.5 л.");
        beer.setPrice(250.99);
        productRepository.save(beer);

        Product tea = new Product();
        tea.setCategory(subCategoryD4);
        tea.setName("Чай");
        tea.setDescription("Черный/Зеленый/Фруктовый 1 л.");
        tea.setPrice(250.00);
        productRepository.save(tea);

        Product lemonade = new Product();
        lemonade.setCategory(subCategoryD4);
        lemonade.setName("Лимонад");
        lemonade.setDescription("Груша/Лимон/Фейхоа");
        lemonade.setPrice(170.99);
        productRepository.save(lemonade);
















    }
}

