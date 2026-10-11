package edu.utj.evnd.poo.tablas;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class PrimaryController implements Initializable {
    
    @FXML private TextField tfNombre;
    @FXML private TextField tfPrecio;
    @FXML private TextField tfCantidad;
    @FXML private TextField tfProveedor;
    @FXML private Button btnAgregar;
    @FXML private Button btnReiniciar;
    @FXML private Button btnEliminar;
    
    @FXML private TableView<Producto> tvProducto;
    @FXML private TableColumn<Producto , String> tcNombre;
    @FXML private TableColumn<Producto , Double> tcPrecio;
    @FXML private TableColumn<Producto , Integer> tcCantidad;
    @FXML private TableColumn<Producto , String> tcProveedor;
    
    private final Producto[] PRODUCTOS_INICIALES = {
        new Producto("Manzana", 1.99, 100, "Frutas del Valle"),
        new Producto("Pera", 2.99, 200, "Agricola San Jose"),
        new Producto("Naranja", 3.99, 300, "Citricos de Jalisco")
    };
    
    private final ObservableList<Producto> listaProductos = 
            FXCollections.observableArrayList(PRODUCTOS_INICIALES);
            
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        tcNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tcPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        tcCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        tcProveedor.setCellValueFactory(new PropertyValueFactory<>("proveedor"));
        
        tvProducto.setItems(listaProductos);
        
        listaProductos.add(new Producto("Piña", 3.99, 500, "Distribuidora La Huerta"));
        
        tcNombre.setCellFactory(TextFieldTableCell.forTableColumn());
        
        tvProducto.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    
    @FXML 
    public void manejarBtnAgregar(ActionEvent actionEvent){
        try{
           String nombre = tfNombre.getText();
           double precio = Double.parseDouble(tfPrecio.getText());
           int cantidad = Integer.parseInt(tfCantidad.getText());
           String proveedor = tfProveedor.getText();
           
           listaProductos.add(new Producto(nombre, precio, cantidad, proveedor));
        } catch (NumberFormatException e){
            new Alert(Alert.AlertType.ERROR, "Precio o cantidad no valida").show();
        }
        
    }
    
    @FXML
    public void manejarBtnReiniciar(ActionEvent actionEvent){
        tfNombre.setText("");
        tfPrecio.setText("");
        tfCantidad.setText("");
        tfProveedor.setText("");
    }
    
    @FXML
   public void manejarEditarNombre(TableColumn.CellEditEvent<Producto, String> evento) {
        TablePosition<Producto, String> pos = evento.getTablePosition();
        String nuevoNombre = evento.getNewValue();
        int fila = pos.getRow();
        Producto producto = evento.getTableView().getItems().get(fila);
        producto.setNombre(nuevoNombre);
    }
    
    @FXML
    public void manejarBtnEliminar(ActionEvent actionEvent){
        ObservableList<Integer> filasSeleccionadas = tvProducto.getSelectionModel().getSelectedIndices();
        
        Integer[] indicesSeleccionados = new Integer[filasSeleccionadas.size()];
        
        indicesSeleccionados = filasSeleccionadas.toArray(indicesSeleccionados);
        
        Arrays.sort(indicesSeleccionados);
        
        for (int i = indicesSeleccionados.length - 1; i >= 0; i--){
            tvProducto.getSelectionModel().clearSelection(indicesSeleccionados[i].intValue());
            tvProducto.getItems().remove(indicesSeleccionados[i].intValue());
        }
        
        
    }
                
}
