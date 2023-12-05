package application;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.text.TextFlow;

public class Q12 extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Marché d'ici");

		BorderPane borderPane = new BorderPane();

		Text boldText = new Text("Bienvenue sur la site Marché d'ici!\n Marché d'ici, l'idée d'être humain\n");
		boldText.setFont(Font.font("Arial", 25));
		boldText.setStyle("-fx-font-weight: bold;");

		Text normalText = new Text(
				"\n Choissisez une des nos catégories pour commancer votre aventure avec les produits, aux fabrications et à l’artisanat français");
		normalText.setFont(Font.font("Arial", 15));

		TextFlow textFlow = new TextFlow(boldText, normalText);
		textFlow.setPrefWidth(300);
		textFlow.setTextAlignment(TextAlignment.CENTER);
		textFlow.setPadding(new Insets(20));
		borderPane.setCenter(textFlow);

		ScrollBar vScrollBar = new ScrollBar();
		vScrollBar.setOrientation(Orientation.VERTICAL);
		borderPane.setRight(vScrollBar);

		File file1 = new File(
				"/Users/zieba.oliwia/Desktop/MIASHS/L3/IHM/tp1_images/png-transparent-computer-icons-pittsburg-button-search-box-button-thumbnail.png");
		Image image1 = new Image(file1.toURI().toString());
		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitWidth(20);
		imageView1.setFitHeight(20);

		File file2 = new File(
				"/Users/zieba.oliwia/Desktop/MIASHS/L3/IHM/tp1_images/computer-icons-handshake-icon-design-clip-art-shake-hands.jpg");
		Image image2 = new Image(file2.toURI().toString());
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitWidth(20);
		imageView2.setFitHeight(20);

		File file3 = new File(
				"/Users/zieba.oliwia/Desktop/MIASHS/L3/IHM/tp1_images/computer-icons-google-account-icon-design-login-png-favpng-jFjxPac6saRuDE3LiyqsYTEZM.jpg");
		Image image3 = new Image(file3.toURI().toString());
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitWidth(20);
		imageView3.setFitHeight(20);

		File file4 = new File(
				"/Users/zieba.oliwia/Desktop/MIASHS/L3/IHM/tp1_images/pngtree-shopping-cart-convenient-icon-png-image_4637407.jpg");
		Image image4 = new Image(file4.toURI().toString());
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitWidth(20);
		imageView4.setFitHeight(20);

		Label searchLabel = new Label("Marché d'ici");

		EventHandler<MouseEvent> eventHandler9 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Text boldText = new Text("Bienvenue sur la site Marché d'ici!\n Marché d'ici, l'idée d'être humain\n");
				boldText.setFont(Font.font("Arial", 25));
				boldText.setStyle("-fx-font-weight: bold;");

				Text normalText = new Text(
						"\n Choissisez une des nos catégories pour commancer votre aventure avec les produits, aux fabrications et à l’artisanat français");
				normalText.setFont(Font.font("Arial", 15));

				TextFlow textFlow = new TextFlow(boldText, normalText);
				textFlow.setPrefWidth(300);
				textFlow.setTextAlignment(TextAlignment.CENTER);

				StackPane newContent = new StackPane(textFlow);

				newContent.setPadding(new Insets(20));

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(newContent);
			}
		};

		searchLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler9);

		TextField searchField = new TextField();
		Button searchButton = new Button();
		searchButton.setGraphic(imageView1);
		Button nousButton = new Button("Qui sommes nous?");
		nousButton.setGraphic(imageView2);

		EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Text boldText = new Text("Marché d'ici, l'idée d'être humain\n");
				boldText.setFont(Font.font("Arial", 25));
				boldText.setStyle("-fx-font-weight: bold;");

				Text normalText = new Text(
						"\n Qualité, transparence et traçabilité des produits sont devenus aujourd’hui des maitres-mots dans notre société où nous sommes de plus en plus nombreux à nous interroger sur la provenance de ce que nous achetons, de ce que nous consommons.\n"
								+ "\n L’idée de mettre en relation producteurs et consommateurs n’est pas nouvelle mais nous avons choisi de la décliner autour d’un concept inédit, pensé pour vous : une plateforme internet réservée aux produits, aux fabrications et à l’artisanat français.");
				normalText.setFont(Font.font("Arial", 15));

				TextFlow textFlow = new TextFlow(boldText, normalText);
				textFlow.setPrefWidth(300);
				textFlow.setTextAlignment(TextAlignment.CENTER);

				StackPane newContent = new StackPane(textFlow);

				newContent.setPadding(new Insets(20));

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(newContent);
			}
		};

		nousButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler3);

		Button compteButton = new Button("Compte");
		compteButton.setGraphic(imageView3);

		EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				GridPane accountCreation = new GridPane();
				accountCreation.setPadding(new Insets(20));
				accountCreation.setHgap(10);
				accountCreation.setVgap(10);

				Label title = new Label("Créer mon compte");
				title.setFont(Font.font("Arial", FontWeight.BOLD, 25));

				Label nameLabel = new Label("Nom:");
				TextField nameField = new TextField();

				Label emailLabel = new Label("Prénom:");
				TextField emailField = new TextField();

				Label passwordLabel = new Label("Mot de passe:");
				PasswordField passwordField = new PasswordField();

				Label confirmPasswordLabel = new Label("Confirmation du mot de passe:");
				PasswordField confirmPasswordField = new PasswordField();

				Button createAccountButton = new Button("Créer le compte");

				EventHandler<MouseEvent> eventHandler5 = new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						Text normalText = new Text("Votre compte a été crée!");
						normalText.setFont(Font.font("Arial", FontWeight.BOLD, 20));

						TextFlow textFlow = new TextFlow(normalText);
						textFlow.setPrefWidth(300);
						textFlow.setTextAlignment(TextAlignment.CENTER);

						StackPane newContent = new StackPane(textFlow);

						newContent.setPadding(new Insets(100));

						Scene currentScene = primaryStage.getScene();

						BorderPane root = (BorderPane) currentScene.getRoot();
						root.setCenter(newContent);
					}
				};

				createAccountButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler5);

				accountCreation.add(title, 0, 0, 2, 1);
				accountCreation.add(nameLabel, 0, 1);
				accountCreation.add(nameField, 1, 1);
				accountCreation.add(emailLabel, 0, 2);
				accountCreation.add(emailField, 1, 2);
				accountCreation.add(passwordLabel, 0, 3);
				accountCreation.add(passwordField, 1, 3);
				accountCreation.add(confirmPasswordLabel, 0, 4);
				accountCreation.add(confirmPasswordField, 1, 4);
				accountCreation.add(createAccountButton, 0, 5, 2, 1);

				accountCreation.setAlignment(Pos.TOP_CENTER);

				accountCreation.setPadding(new Insets(20));

				GridPane loginPane = new GridPane();
				loginPane.setPadding(new Insets(20));
				loginPane.setHgap(10);
				loginPane.setVgap(10);

				Label loginTitle = new Label("Se connecter");
				loginTitle.setFont(Font.font("Arial", FontWeight.BOLD, 25));

				Label emailLoginLabel = new Label("Username:");
				TextField emailLoginField = new TextField();

				Label passwordLoginLabel = new Label("Mot de passe:");
				PasswordField passwordLoginField = new PasswordField();

				Button loginButton = new Button("Se connecter");

				EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						String enteredText = emailLoginField.getText();
						compteButton.setText(enteredText);

						Text normalText = new Text("Bonjour " + enteredText + " !");
						normalText.setFont(Font.font("Arial", FontWeight.BOLD, 20));

						TextFlow textFlow = new TextFlow(normalText);
						textFlow.setPrefWidth(300);
						textFlow.setTextAlignment(TextAlignment.CENTER);

						StackPane newContent = new StackPane(textFlow);

						newContent.setPadding(new Insets(100));

						Scene currentScene = primaryStage.getScene();

						BorderPane root = (BorderPane) currentScene.getRoot();
						root.setCenter(newContent);
					}
				};

				loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler7);

				loginPane.add(loginTitle, 0, 0, 2, 1);
				loginPane.add(emailLoginLabel, 0, 1);
				loginPane.add(emailLoginField, 1, 1);
				loginPane.add(passwordLoginLabel, 0, 2);
				loginPane.add(passwordLoginField, 1, 2);
				loginPane.add(loginButton, 0, 3, 2, 1);

				loginPane.setAlignment(Pos.TOP_CENTER);

				Separator separator = new Separator();
				separator.setOrientation(Orientation.VERTICAL);

				HBox fullContent = new HBox();
				fullContent.getChildren().addAll(accountCreation, separator, loginPane);
				fullContent.setSpacing(20);

				fullContent.setPadding(new Insets(20, 20, 20, 20));

				fullContent.setMaxWidth(Double.MAX_VALUE);
				fullContent.setMaxHeight(Double.MAX_VALUE);

				HBox.setHgrow(accountCreation, Priority.ALWAYS);
				HBox.setHgrow(loginPane, Priority.ALWAYS);

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(fullContent);
			}
		};

		compteButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler2);

		Button panierButton = new Button("Panier");
		panierButton.setGraphic(imageView4);

		EventHandler<MouseEvent> eventHandler6 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				VBox cartContent = new VBox();
				cartContent.setPadding(new Insets(20));
				cartContent.setSpacing(10);

				Label cartTitle = new Label("Votre Panier");
				cartTitle.setFont(Font.font("Arial", FontWeight.BOLD, 25));

				// Ajoutez ici le contenu de votre panier, tel que des articles, quantités,
				// prix, etc.

				Button checkoutButton = new Button("Passer la commande");

				EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						Text normalText = new Text("Votre commande a été passé!");
						normalText.setFont(Font.font("Arial", FontWeight.BOLD, 20));

						TextFlow textFlow = new TextFlow(normalText);
						textFlow.setPrefWidth(300);
						textFlow.setTextAlignment(TextAlignment.CENTER);

						StackPane newContent = new StackPane(textFlow);

						newContent.setPadding(new Insets(100));

						Scene currentScene = primaryStage.getScene();

						BorderPane root = (BorderPane) currentScene.getRoot();
						root.setCenter(newContent);
					}
				};

				checkoutButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler7);

				cartContent.getChildren().addAll(cartTitle, /* faut ajouter les produits, à modifier */ checkoutButton);

				cartContent.setAlignment(Pos.CENTER);

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(cartContent);
			}
		};

		panierButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler6);

		GridPane gridPane = new GridPane();

		gridPane.add(searchLabel, 0, 1, 1, 1);
		gridPane.add(searchField, 1, 1, 1, 1);
		gridPane.add(searchButton, 2, 1, 1, 1);
		gridPane.add(nousButton, 3, 1, 1, 1);
		gridPane.add(compteButton, 4, 1, 1, 1);
		gridPane.add(panierButton, 5, 1, 1, 1);

		vScrollBar.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		Label[] labels = { searchLabel };
		for (Label label : labels) {
			label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			GridPane.setHgrow(label, Priority.ALWAYS);
			GridPane.setVgrow(label, Priority.ALWAYS);
			GridPane.setMargin(label, new Insets(5));
		}

		TextField[] textField = { searchField };
		for (TextField textfield : textField) {
			textfield.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			GridPane.setHgrow(textfield, Priority.ALWAYS);
			GridPane.setVgrow(textfield, Priority.ALWAYS);
			GridPane.setMargin(textfield, new Insets(5));
		}

		Button[] buttons = { searchButton, nousButton, compteButton, panierButton };
		for (Button button : buttons) {
			button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			GridPane.setHgrow(button, Priority.ALWAYS);
			GridPane.setVgrow(button, Priority.ALWAYS);
			GridPane.setMargin(button, new Insets(5));
		}

		MenuBar leftBar = new MenuBar();

		Label label = new Label("Épicerie");
		label.setOnMouseClicked(mouseEvent -> {
			VBox mainContainer = new VBox();
            mainContainer.setAlignment(Pos.TOP_CENTER);
            mainContainer.setSpacing(20);

            Label titleLabel = new Label("Épicerie");
            titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 25;");

            Label descriptionLabel = new Label("Découvrez nos produits d'épicerie de qualité !");
            descriptionLabel.setWrapText(true);
            descriptionLabel.setMaxWidth(300);

            HBox descriptionContainer = new HBox(descriptionLabel);
            descriptionContainer.setAlignment(Pos.CENTER);

            GridPane productsGrid = new GridPane();
            productsGrid.setHgap(20);
            productsGrid.setVgap(20);
            productsGrid.setAlignment(Pos.CENTER);

            VBox productBox1 = new VBox();
            productBox1.setAlignment(Pos.CENTER);
            productBox1.setSpacing(10);

            File file5 = new File("/Users/zieba.oliwia/Desktop/MIASHS/L3/IHM/tp1_images/miel-bienfaits.jpg");
			Image image5 = new Image(file5.toURI().toString());
			ImageView imageView5 = new ImageView(image5);
			imageView5.setFitWidth(200);
			imageView5.setFitHeight(200);

			Label productNameLabel1 = new Label("Product 1");
			Label descriptionLabel1 = new Label("Description 1");
			Label priceLabel1 = new Label("10.99");

			Button addToCartButton1 = new Button("Ajouter au panier");

			productBox1.getChildren().addAll(imageView5, productNameLabel1, descriptionLabel1, priceLabel1,
					addToCartButton1);
			productsGrid.add(productBox1, 0, 0);

			VBox productBox2 = new VBox();
			productBox2.setAlignment(Pos.CENTER);
			productBox2.setSpacing(10);

			File file6 = new File("/Users/zieba.oliwia/Desktop/MIASHS/L3/IHM/tp1_images/miel-sante-produits-8c3951ed708dae0b.jpeg");
			Image image6 = new Image(file6.toURI().toString());
			ImageView imageView6 = new ImageView(image6);
			imageView6.setFitWidth(200);
			imageView6.setFitHeight(200);

			Label productNameLabel2 = new Label("Product 2");
			Label descriptionLabel2 = new Label("Description 2");
			Label priceLabel2 = new Label("20.99");

			Button addToCartButton2 = new Button("Ajouter au panier");

			productBox2.getChildren().addAll(imageView6, productNameLabel2, descriptionLabel2, priceLabel2,
					addToCartButton2);
			productsGrid.add(productBox2, 1, 0);

			VBox productBox3 = new VBox();
			productBox3.setAlignment(Pos.CENTER);
			productBox3.setSpacing(10);

			File file7 = new File("/Users/zieba.oliwia/Desktop/MIASHS/L3/IHM/tp1_images/57fb713a32241-main-14578671.jpg");
			Image image7 = new Image(file7.toURI().toString());
			ImageView imageView7 = new ImageView(image7);
			imageView7.setFitWidth(200);
			imageView7.setFitHeight(200);

			Label productNameLabel3 = new Label("Product 3");
			Label descriptionLabel3 = new Label("Description 3");
			Label priceLabel3 = new Label("30.99");
			
			Button addToCartButton3 = new Button("Ajouter au panier");

            productBox3.getChildren().addAll(imageView7, productNameLabel3, descriptionLabel3, priceLabel3, addToCartButton3);
            productsGrid.add(productBox3, 2, 0);

            StackPane newContent = new StackPane(mainContainer);
            newContent.setPadding(new Insets(20));

            Scene currentScene = primaryStage.getScene();
            BorderPane root = (BorderPane) currentScene.getRoot();

            mainContainer.getChildren().addAll(titleLabel, descriptionContainer, productsGrid);
            root.setCenter(newContent);
		});

		Menu menu1 = new Menu("", label);

		Menu menu2 = new Menu("Boissons");
		Menu menu3 = new Menu("Hygiène/Beauté");
		Menu menu4 = new Menu("Maison");
		Menu menu5 = new Menu("Vêtements");

		leftBar.getMenus().addAll(menu1, menu2, menu3, menu4, menu5);
		MenuBar rightBar = new MenuBar();

		Menu menu6 = new Menu("Nos producteurs");

		rightBar.getMenus().addAll(menu6);

		Region spacer = new Region();
		spacer.getStyleClass().add("menu-bar");
		HBox.setHgrow(spacer, Priority.SOMETIMES);
		HBox menubars = new HBox(leftBar, spacer, rightBar);

		VBox vBox = new VBox(gridPane, menubars);
		borderPane.setTop(vBox);

		borderPane.setPadding(new Insets(5));

		Scene scene = new Scene(borderPane, 900, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
