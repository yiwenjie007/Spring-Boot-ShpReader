package com.appleyk.geotools;

import com.vividsolutions.jts.geom.MultiPolygon;

import static com.appleyk.geotools.GeoToolsUtils.writeSHP;

public class demo {
    static GeometryCreator gCreator = GeometryCreator.getInstance();

    public static void main(String[] args) throws Exception {
        System.out.println("===============创建自己的shp文件==============");
        String MPolygonWKT="MULTIPOLYGON(((116.3824004 39.9032955,116.3824261 39.9034733,116.382512 39.9036313,116.382718 39.9038025,116.3831643 39.903954,116.383602 39.9040198,116.3840827 39.9040001,116.3844003 39.9039211,116.3846921 39.903763,116.3848552 39.9035787,116.3848981 39.9033548,116.3848037 39.9031244,116.3845719 39.9029071,116.3842286 39.9027754,116.3837823 39.9027227,116.3833789 39.9027095,116.383027 39.902749,116.3828038 39.9028346,116.382615 39.90294,116.3824776 39.9030717,116.3824004 39.9032955)))";
        MultiPolygon multiPolygon = gCreator.createMulPolygonByWKT(MPolygonWKT);
        System.out.println(multiPolygon.getGeometryType());
        //首先得创建my这个目录
        writeSHP("D:\\project\\Java\\shp\\multipol.shp",multiPolygon);
    }
}
