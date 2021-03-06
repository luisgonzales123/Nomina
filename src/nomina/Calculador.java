package nomina;

import java.util.ArrayList;

public class Calculador {
    
    public static String calcularInssPatronal(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getInss_patronal();
        return String.format("%.2f", valor);
    }
    
    public static String calcularInssLaboral(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getInss_laboral();
        return String.format("%.2f", valor);
    }
    
    public static String calcularInatec(ArrayList<Empleado> empleados) {
        double inatec = 0;
        for(Empleado e : empleados) 
            inatec += e.getInatec();
        return String.format("%.2f", inatec);
    }
    
    public static String calcularIrLaboral(ArrayList<Empleado> empleados) {
        double irLaboral = 0;
        for(Empleado e : empleados) 
            irLaboral += e.getIr_laboral();
        return String.format("%.2f", irLaboral);
    }
    
    public static String calcularNominaPorPagar(ArrayList<Empleado> empleados) {
        double nominaXPagar = 0;
        for(Empleado e : empleados) 
            nominaXPagar += e.getRemuneracion_neta();
        return String.format("%.2f", nominaXPagar);
    }
    
    public static String calcularSueldosSalarios(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getSalario_mensual();
        return String.format("%.2f", valor);
    }
    
    public static String calcularHorasExtras(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getIngresos_horas_extras();
        return String.format("%.2f", valor);
    }
    
    public static String calcularAntiguedad(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getAntiguedad();
        return String.format("%.2f", valor);
    }
    
    public static String calcularVacaciones(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getVacaciones();
        return String.format("%.2f", valor);
    }
    
    public static String calcularTreceavoMes(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getTreceavo_mes();
        return String.format("%.2f", valor);
    }
    
    public static String calcularIndemnizacionLaboral(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getIndemnizacion_laboral();
        return String.format("%.2f", valor);
    }
    
    public static String calcularBonos(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getBonos();
        return String.format("%.2f", valor);
    }
    
    public static String calcularOtrosIngresos(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getOtros_ingresos();
        return String.format("%.2f", valor);
    }
    
    public static String calcularOtrasDeducciones(ArrayList<Empleado> empleados) {
        double valor = 0;
        for(Empleado e : empleados) 
            valor += e.getOtras_deducciones();
        return String.format("%.2f", valor);
    }
    
}
