package Gerard_Fernandez_fe_gc_c4_ta28_1;

public class Gerard_Fernandez_fe_gc_c4_ta28_1_App {

	public static void main(String[] args) {
		//Se llama a la ventada
		try {
			
			Gerard_Fernandez_fe_gc_c4_ta28_1 frame = new Gerard_Fernandez_fe_gc_c4_ta28_1();
			//Al frame se le pide que se vuelva visible
			frame.setVisible(true);
			
		//En caso de que diera un fallo al llamarlo o volverse visible
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
