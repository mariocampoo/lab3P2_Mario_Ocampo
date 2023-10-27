package lab3p2_mario_ocampo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab3P2_Mario_Ocampo {

    public static void main(String[] args) {
        ArrayList<AppsUtilidad> utilidad = new ArrayList();
        ArrayList<AppsJuegos> juegos = new ArrayList();
        ArrayList descargas = new ArrayList();

        int menu1 = 0;
        while (menu1 != 2) {
            menu1 = Integer.parseInt(JOptionPane.showInputDialog("1. iniciar como admin\n"
                    + "2. Salir"));

            if (menu1 == 1) {
                int menu2 = 0;

                while (menu2 != 7) {
                    menu2 = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Aplicacion\n"
                            + "2. biblioteca\n"
                            + "3. Actualizacion\n"
                            + "4. Eliminar Aplicacion\n"
                            + "5. Estadisticas de Desarrollador\n"
                            + "\n"
                            + "6. ---Iniciar como usuario---\n"
                            + "7. Salir"));

                    if (menu2 == 1) {

                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la App");
                        String desarrollador = JOptionPane.showInputDialog("Ingrese el nombre del desarrollador");
                        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
                        String categoria = JOptionPane.showInputDialog("Ingrese la categoria -(utilidad o juego)-");
                        if ("utilidad".equals(categoria)) {
                            AppsUtilidad obj = new AppsUtilidad(nombre, desarrollador, precio, categoria);
                            utilidad.add(obj);
                        } else if ("juego".equals(categoria)) {
                            int EdadRecomendada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad recomendada"));
                            AppsJuegos obj = new AppsJuegos(EdadRecomendada, nombre, desarrollador, precio, categoria);
                            juegos.add(obj);
                        }
                    }

                    if (menu2 == 2) {
                        System.out.println(utilidad);
                        System.out.println("");
                        System.out.println(juegos);
                    }

                    if (menu2 == 3) {
                        int ind = Integer.parseInt(JOptionPane.showInputDialog("1. utilidades\n"
                                + "2. juegos"));
                        if (ind == 1) {
                            String nb = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                            for (AppsUtilidad gg : utilidad) {
                                if (gg.getNombre().equals(nb)) {
                                    
                                    int mod = Integer.parseInt(JOptionPane.showInputDialog("Que elemento desea modificar?\n"
                                        + "1. Nombre\n"
                                        + "2. desarrollador\n"
                                        + "3. precio"));
                                    if (mod== 1) {
                                        String nuevo = JOptionPane.showInputDialog("Ingrese nuevo nombre");
                                        gg.setNombre(nuevo);
                                        System.out.println("");
                                        System.out.println(utilidad);
                                                
                                    }
                                    if (mod == 2) {
                                        String nv = JOptionPane.showInputDialog("Ingrese nuevo admin");
                                        gg.setDesarrollador(nv);
                                        System.out.println("");
                                        System.out.println(utilidad);
                                    }
                                    if (mod == 3) {
                                        int pr = Integer.parseInt(JOptionPane.showInputDialog("ingrese nuevo precio"));
                                        gg.setPrecio(pr);
                                        System.out.println("");
                                        System.out.println(utilidad);
                                    }
                                }
                            }
                        }
                        if (ind == 2) {
                            String nb = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                            for (AppsJuegos gg : juegos) {
                                if (gg.getNombre().equals(nb)) {
                                    
                                    int mod = Integer.parseInt(JOptionPane.showInputDialog("Que elemento desea modificar?\n"
                                        + "1. Nombre\n"
                                        + "2. desarrollador\n"
                                        + "3. precio"));
                                    if (mod== 1) {
                                        String nuevo = JOptionPane.showInputDialog("Ingrese nuevo nombre");
                                        gg.setNombre(nuevo);
                                        System.out.println("");
                                        System.out.println(juegos);
                                                
                                    }
                                    if (mod == 2) {
                                        String nv = JOptionPane.showInputDialog("Ingrese nuevo admin");
                                        gg.setDesarrollador(nv);
                                        System.out.println("");
                                        System.out.println(juegos);
                                    }
                                    if (mod == 3) {
                                        int pr = Integer.parseInt(JOptionPane.showInputDialog("ingrese nuevo precio"));
                                        gg.setPrecio(pr);
                                        System.out.println("");
                                        System.out.println(juegos);
                                    }
                                }
                            }
                            
                        }
                    }

                    if (menu2 == 4) {
                        System.out.println(utilidad);
                        System.out.println("");
                        System.out.println(juegos);

                        String categoria = JOptionPane.showInputDialog("Ingrese la catgoria -(utilidad o juego)-");
                        if ("utilidad".equals(categoria)) {
                            for (AppsUtilidad busq : utilidad) {
                                if (busq.getCategoria().equals(categoria)) {
                                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                                    for (AppsUtilidad nm : utilidad) {
                                        if (nm.getNombre().equals(nombre)) {
                                            utilidad.remove(nm);
                                        }
                                    }
                                }
                            }

                        } else if ("juego".equals(categoria)) {
                            for (AppsJuegos busq : juegos) {
                                if (busq.getCategoria().equals(categoria)) {
                                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                                    for (AppsJuegos nm : juegos) {
                                        if (nm.getNombre().equals(nombre)) {
                                            juegos.remove(nm);
                                        }
                                    }
                                }
                            }

                        }
                    }
                    if (menu2 == 6) {
                        int mn = 0;

                        while (mn != 7) {
                            mn = Integer.parseInt(JOptionPane.showInputDialog("1. Buscar por nombre\n"
                                    + "2. Buscar por categoria\n"
                                    + "3. biblioteca\n"
                                    + "4. Mostar descargas\n"
                                    + "5.eliminar descargas\n"
                                    + "6. calificar aplicacion\n"
                                    + "7. Salir"));

                            if (mn == 1) {
                                int n = Integer.parseInt(JOptionPane.showInputDialog("1. Apps de utilidades\n"
                                        + "2. Apps de Juegos"));
                                if (n == 1) {
                                    String nmb = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                                    for (AppsUtilidad dsc : utilidad) {
                                        if (dsc.getNombre().equals(n)) {
                                            System.out.println(utilidad);
                                        }
                                    }
                                }
                                if (n == 2) {
                                    String nmb = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                                    for (AppsJuegos dsc : juegos) {
                                        if (dsc.getNombre().equals(n)) {
                                            System.out.println(juegos);
                                        }
                                    }
                                }
                            }

                            if (mn == 2) {
                                String categoria = JOptionPane.showInputDialog("Ingrese la catgoria -(utilidad o juego)-");
                                if ("utilidad".equals(categoria)) {
                                    for (AppsUtilidad busq : utilidad) {
                                        if (busq.getCategoria().equals(categoria)) {
                                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                                            for (AppsUtilidad nm : utilidad) {
                                                if (nm.getNombre().equals(nombre)) {
                                                    descargas.add(nm);
                                                    System.out.println(utilidad);
                                                }
                                            }
                                        }
                                    }

                                } else if ("juego".equals(categoria)) {
                                    for (AppsJuegos busq : juegos) {
                                        if (busq.getCategoria().equals(categoria)) {
                                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la app");
                                            for (AppsJuegos nm : juegos) {
                                                if (nm.getNombre().equals(nombre)) {
                                                    descargas.add(nm);
                                                    System.out.println(juegos);
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                            if (mn == 3) {
                                System.out.println("---Biblioteca---");
                                System.out.println(utilidad);
                                System.out.println("");
                                System.out.println(juegos);
                            }

                            if (mn == 4) {
                                System.out.println(descargas);
                            }
                            if (mn == 5) {
                                String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la APP");
                                if (descargas.contains(nombre)) {
                                    descargas.remove(nombre);
                                    System.out.println(descargas);
                                }
                            }
                            if (mn == 6) {

                            }
                        }
                    }
                }
            }

        }
    }
}
