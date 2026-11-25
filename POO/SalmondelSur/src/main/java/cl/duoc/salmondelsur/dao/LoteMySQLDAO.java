package cl.duoc.salmondelsur.dao;

import cl.duoc.salmondelsur.config.Conexion;
import cl.duoc.salmondelsur.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// ACTIVIDAD 4: completar el CRUD de lotes contra MySQL.
public class LoteMySQLDAO {

    public List<LoteSalmon> listar() {
        List<LoteSalmon> salmones = new ArrayList<>();
        try(Connection cn = Conexion.abrir();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM `lotes_salmon`");
            ResultSet rs = ps.executeQuery()) {
        while (rs.next()){
            int id = rs.getInt("id");
            String codigo = rs.getString("codigo");
            String centro = rs.getString("centro");
            int kilos = rs.getInt("kilos");

            if ("FRESCO".equals(rs.getString("tipo"))){
                salmones.add(new LoteFresco(id,codigo,centro,kilos));
            }else{
                salmones.add(new LoteCongelado(id,codigo,centro,kilos));
            }


        }

        } catch (SQLException e) {
            throw new RuntimeException("Error al listar: " + e.getMessage(), e);
        }


        return salmones; // Implementar consulta real.
    }

    // done: INSERT si id == 0; UPDATE si id != 0. Usar PreparedStatement.
    public void guardar(LoteSalmon lote) {
        String sql = "INSERT INTO lotes_salmon (codigo,centro,kilos,tipo) VALUES(?,?,?,?)";

        if (lote.getId() !=0){
            sql = "UPDATE lotes_salmon SET codigo=?,centro=?,kilos=?,tipo=? WHERE id=?";
        }

        try(Connection cn = Conexion.abrir(); PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setString(1, lote.getCodigo());
            ps.setString(2, lote.getCentro());
            ps.setInt(3, lote.getKilos());
            ps.setString(4, lote.getTipo());

            if(lote.getId() != 0){
                ps.setInt(5, lote.getId());
            }
            int filas = ps.executeUpdate();
            if (filas == 0){
                throw new RuntimeException("No se encontro el registro del lote");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al guardar lote: " + e.getMessage(), e);
        }


    }

    // done: DELETE FROM lotes_salmon WHERE id = ?.
    public void eliminar(int id) {
        try (Connection cn = Conexion.abrir();
        PreparedStatement ps = cn.prepareStatement("DELETE FROM lotes_salmon WHERE id=?")){
            ps.setInt(1,id);

            int filas = ps.executeUpdate();
            if (filas == 0){
                throw new RuntimeException("No se encontro el registro del lote");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar lote: " + e.getMessage(), e);
        }
    }
}
