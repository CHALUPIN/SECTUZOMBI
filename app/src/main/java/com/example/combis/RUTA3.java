package com.example.combis;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.material.snackbar.Snackbar;

public class RUTA3 extends Fragment {

    private GoogleMap mapView;
    private OnMapReadyCallback callback = new OnMapReadyCallback() {


        @Override
        public void onMapReady(GoogleMap googleMap) {
//instancias
            mapView = googleMap;

            //limites visuales
            LatLngBounds adelaideBounds = new LatLngBounds(
                    new LatLng(19.928198, -98.902411), // SW bounds
                    new LatLng(20.303448, -98.533682)  // NE bounds
            );
            // Constrain the camera target to the Adelaide bounds.
            mapView.setLatLngBoundsForCameraTarget(adelaideBounds);
            mapView.setMaxZoomPreference(19);
            mapView.setMinZoomPreference(15);

            //limite de pachuca
            LatLngBounds pachuca = new LatLngBounds(
                    new LatLng(19.928198, -98.902411), // SW bounds
                    new LatLng(20.303448, -98.533682)  // NE bounds
            );
            //centro del marcador
            mapView.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(20.13028983089965, -98.73008707454392), 17));

            //marker de base
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(20.13028983089965, -98.73008707454392))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $17")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue))
            );
            //marker de base
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(20.16946500762883, -98.64852318661585))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $17")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue))
            );

            //RUTA
            Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(20.13028983089965, -98.73008707454392),
                            new LatLng(20.130303681875553, -98.7301554708726),
                            new LatLng(20.130643311403507, -98.73006619767013),
                            new LatLng(20.131702108588126, -98.72986394546669),
                            new LatLng(20.13242049820624, -98.72964430570502),
                            new LatLng(20.13307609429128, -98.72964859041916),
                            new LatLng(20.13331364562539, -98.72957510174766),
                            new LatLng(20.133996916433418, -98.72905726208889),
                            new LatLng(20.134362069460504, -98.72884536757778),
                            new LatLng(20.134453987158178, -98.72882390990574),
                            new LatLng(20.134547163946817, -98.72885207309959),//El arbolito
                            new LatLng(20.13493810905083, -98.72836688661278),
                            new LatLng(20.134966179840227, -98.72785509427173),
                            new LatLng(20.134879299017417, -98.72717783650037),
                            new LatLng(20.134959884130907, -98.72685463031573),
                            new LatLng(20.135098389698072, -98.72667089899738),
                            new LatLng(20.13530111125864, -98.72661457260904),
                            new LatLng(20.13551949668838, -98.72635814475233),
                            new LatLng(20.1355874901048, -98.72614088582021),
                            new LatLng(20.135936270671113, -98.72553470658666),
                            new LatLng(20.13637570789252, -98.72464153098805),
                            new LatLng(20.136423554850687, -98.72441220211317),
                            new LatLng(20.136383262676507, -98.72419091986818),
                            new LatLng(20.136084848440575, -98.72386234926827),
                            new LatLng(20.135781397089023, -98.72381675171437),
                            new LatLng(20.135618968528245, -98.72385698485016),
                            new LatLng(20.135398619441652, -98.72402462291072),
                            new LatLng(20.13527774208826, -98.72425529289153),
                            new LatLng(20.134971770887955, -98.72507873105208),
                            new LatLng(20.134447966942652, -98.72576939987178),
                            new LatLng(20.13432079312416, -98.7260778539152),
                            new LatLng(20.134094361308733, -98.72691762688675),
                            new LatLng(20.134095645580636, -98.72717643602947),
                            new LatLng(20.134161121316733, -98.72755194527699),
                            new LatLng(20.13414601153323, -98.72773701770721),
                            new LatLng(20.134037724713, -98.72802133185886),
                            new LatLng(20.133428295159355, -98.72846926077142),
                            new LatLng(20.133093363718093, -98.72856049532069),
                            new LatLng(20.132788647395863, -98.72858463519452),
                            new LatLng(20.132320239334625, -98.7284076093956),
                            new LatLng(20.132086034771746, -98.72819035043821),
                            new LatLng(20.13080978950938, -98.72677688711696),
                            new LatLng(20.130099217374724, -98.72524563888139),
                            new LatLng(20.12987508295267, -98.72505788424417),
                            new LatLng(20.1296257645074, -98.72503642657753),
                            new LatLng(20.128857659733875, -98.72516785482433),
                            new LatLng(20.128517677725668, -98.72515980817833),
                            new LatLng(20.128177694980334, -98.72502569771504),
                            new LatLng(20.126581025392493, -98.72424785711173),
                            new LatLng(20.126004306342384, -98.7234995208135),
                            new LatLng(20.125890589370997, -98.72289849234049),
                            new LatLng(20.12619280071323, -98.7223271818186),
                            new LatLng(20.127051581415156, -98.72166199400382),
                            new LatLng(20.12739912182826, -98.72102094603999),
                            new LatLng(20.127378974580257, -98.7203101606742),
                            new LatLng(20.12758800216242, -98.71990782933737),
                            new LatLng(20.127970798940563, -98.71985150293638),
                            new LatLng(20.129306959970826, -98.7200800043779),
                            new LatLng(20.12962175656059, -98.71997808043311),
                            new LatLng(20.12973256480948, -98.71976618592997),
                            new LatLng(20.129604127971838, -98.7187979085126),
                            new LatLng(20.129730046444287, -98.71826951333554),
                            new LatLng(20.13024127440221, -98.71745948617969),
                            new LatLng(20.130608954556767, -98.71595744914634),
                            new LatLng(20.130681986814967, -98.71382777520968),
                            new LatLng(20.130637677874233, -98.71166360306569),
                            new LatLng(20.13084166440058, -98.71130686927174),
                            new LatLng(20.13122445321137, -98.71116202998212),
                            new LatLng(20.132042532833978, -98.71101524587779),
                            new LatLng(20.13222888922649, -98.7107738470863),
                            new LatLng(20.132443354318827, -98.70925567719102),
                            new LatLng(20.13268511330388, -98.70877287958929),
                            new LatLng(20.13295457339781, -98.70849929427571),
                            new LatLng(20.133143447016256, -98.70839200592393),
                            new LatLng(20.13355393157356, -98.70826057768306),
                            new LatLng(20.13415328744991, -98.70822302674826),
                            new LatLng(20.134427781597388, -98.70811037397095),
                            new LatLng(20.13450584865145, -98.70797626353124),
                            new LatLng(20.134525994981647, -98.70782069542116),
                            new LatLng(20.13450584865145, -98.70763562301435),
                            new LatLng(20.13393923204483, -98.70696507075174),
                            new LatLng(20.133571559724373, -98.7068175492365),
                            new LatLng(20.133508602041534, -98.70683632467957),
                            new LatLng(20.133060342654954, -98.70700798603268),
                            new LatLng(20.132954573395548, -98.70702944370169),
                            new LatLng(20.132692668266934, -98.70690606209718),
                            new LatLng(20.132609563663248, -98.70656810378907),
                            new LatLng(20.1327908827416, -98.70581440311784),
                            new LatLng(20.132700223227953, -98.70511971093867),
                            new LatLng(20.132770736187656, -98.70443038321858),
                            new LatLng(20.132440835995745, -98.70385102605722),
                            new LatLng(20.132435799345775, -98.70368204688067),
                            new LatLng(20.132596972050962, -98.7033762750495),
                            new LatLng(20.1338940892592, -98.70262061424764),
                            new LatLng(20.134075406847955, -98.70229338476061),
                            new LatLng(20.13400237617805, -98.70204125713394),
                            new LatLng(20.13357174635707, -98.70184545585933),
                            new LatLng(20.133435757741214, -98.70175157851003),
                            new LatLng(20.13284899070871, -98.70088790721358),
                            new LatLng(20.132720556428904, -98.70042656725818),
                            new LatLng(20.132775959463746, -98.70008860892693),
                            new LatLng(20.132914466965786, -98.69979624814363),
                            new LatLng(20.133686312544143, -98.69922120917751),
                            new LatLng(20.134129533544765, -98.6987840090959),
                            new LatLng(20.13441913749245, -98.69869281399379),
                            new LatLng(20.135557831815284, -98.69880170096548),
                            new LatLng(20.135865061000448, -98.6985978530971),
                            new LatLng(20.135900316771252, -98.69851738681162),
                            new LatLng(20.135960755215965, -98.69822770823713),
                            new LatLng(20.13591542638456, -98.69741768111157),
                            new LatLng(20.136157179997323, -98.69715750685165),
                            new LatLng(20.13627553840497, -98.69712263812738),
                            new LatLng(20.13704360672459, -98.69707704056162),
                            new LatLng(20.137242548394003, -98.69690537918842),
                            new LatLng(20.1372903950867, -98.69669616688434),
                            new LatLng(20.137131686042157, -98.69612664691367),
                            new LatLng(20.13719464225856, -98.69581819288648),
                            new LatLng(20.137778874734025, -98.69522810690319),
                            new LatLng(20.13790226838404, -98.6951986025914),
                            new LatLng(20.13806847192139, -98.69518250933865),
                            new LatLng(20.13889377853439, -98.6952807893844),//CONECTOR DE CARETERA VIEJA
                            new LatLng(20.1395510327646, -98.69488918688741),
                            new LatLng(20.14028573462994, -98.69392678351404),
                            new LatLng(20.140514890508307, -98.69284585329827),
                            new LatLng(20.140315953007327, -98.6922772249688),
                            new LatLng(20.139842176898895, -98.69166305750852),
                            new LatLng(20.13902627619747, -98.69089594573337),
                            new LatLng(20.138892810550736, -98.69051507202853),
                            new LatLng(20.138885255888436, -98.690088600791),
                            new LatLng(20.138917992756173, -98.68988207071382),
                            new LatLng(20.139529919106426, -98.68902644606561),
                            new LatLng(20.13986232254095, -98.68795624469247),
                            new LatLng(20.140177275160607, -98.68656182443053),
                            new LatLng(20.140600332205643, -98.68590736540088),
                            new LatLng(20.14117699739476, -98.68558013589933),//conector carretera vieja
                            new LatLng(20.141640342555565, -98.68545943648239),
                            new LatLng(20.14257710140474, -98.68544870764086),
                            new LatLng(20.143229303844954, -98.68521535544681),
                            new LatLng(20.144060291426953, -98.68466282038267),
                            new LatLng(20.144619316956792, -98.68449384121256),
                            new LatLng(20.145032289472745, -98.68445629028943),
                            new LatLng(20.145833050154465, -98.68476742652433),
                            new LatLng(20.146480202809105, -98.68515366464148),
                            new LatLng(20.146696759128375, -98.68522071985895),
                            new LatLng(20.14721044965465, -98.68499273209991),
                            new LatLng(20.147502496931864, -98.68362745587584),
                            new LatLng(20.147399255537938, -98.68276646672425),
                            new LatLng(20.147474798029645, -98.68248483477355),
                            new LatLng(20.14798596792461, -98.6817472272878),
                            new LatLng(20.14810431736917, -98.68052950441134),
                            new LatLng(20.148429148354598, -98.67984822331758),
                            new LatLng(20.148368714734584, -98.67929032383891),
                            new LatLng(20.14813705230377, -98.67901942070853),
                            new LatLng(20.14753271391605, -98.6786117249244),
                            new LatLng(20.14723306193108, -98.67809942299041),
                            new LatLng(20.145474451151184, -98.67308261131625),
                            new LatLng(20.145497628990793, -98.67256330422478),
                            new LatLng(20.14566886067095, -98.67226021461049),
                            new LatLng(20.14789757689402, -98.67089685757954),
                            new LatLng(20.14823499866063, -98.67088612874696),
                            new LatLng(20.148451553032356, -98.67102289287834),
                            new LatLng(20.14913142955838, -98.67185705987258),
                            new LatLng(20.14927747672185, -98.67219233598513),
                            new LatLng(20.149282512828403, -98.67242568815024),
                            new LatLng(20.149224597593204, -98.67266172252415),
                            new LatLng(20.149078550382963, -98.67285752376613),
                            new LatLng(20.148783937484183, -98.6730130918996),
                            new LatLng(20.147937902171744, -98.67307235869218),
                            new LatLng(20.14757529896237, -98.67315818937361),
                            new LatLng(20.14727061089242, -98.67341836362667),
                            new LatLng(20.147169887429303, -98.67372949991409),
                            new LatLng(20.147227803426542, -98.67402990729907),
                            new LatLng(20.147333563018247, -98.67427935271695),
                            new LatLng(20.14779230443926, -98.6746815784288),
                            new LatLng(20.148270738387154, -98.67492834163788),
                            new LatLng(20.14961280958507, -98.67521836073354),
                            new LatLng(20.150627579610372, -98.67573602706723),
                           new LatLng(20.150761035225305, -98.67578698903434),
                            new LatLng(20.15095240534983, -98.67578967124578),
                            new LatLng(20.151612126860464, -98.67565824300692),
                            new LatLng(20.151906734422095, -98.67572798043646),
                            new LatLng(20.15211321118564, -98.67588354855867),
                            new LatLng(20.152671727396058, -98.67699256501487),
                            new LatLng(20.15289331111935, -98.67723932823102),
                            new LatLng(20.153215614152877, -98.6772420104409),
                            new LatLng(20.153424607170187, -98.67698988279307),
                            new LatLng(20.15329367182153, -98.67533764209506),
                            new LatLng(20.15306189579985, -98.67488808640218),
                            new LatLng(20.152681681848314, -98.67467888790767),
                            new LatLng(20.151752537649678, -98.67464401915854),
                            new LatLng(20.151402533392407, -98.67444553569581),
                            new LatLng(20.15141008744734, -98.67403247550445),
                            new LatLng(20.152407219768563, -98.67346652940824),
                            new LatLng(20.152711897819138, -98.67302664714718),
                            new LatLng(20.15262376786723, -98.67259749370365),
                            new LatLng(20.151750397332926, -98.67107323618735),
                            new LatLng(20.151720181168937, -98.67074600668793),
                            new LatLng(20.15220615710275, -98.67000571701415),
                            new LatLng(20.15203996861315, -98.66873971439526),
                            new LatLng(20.15189392403416, -98.66859487503505),
                            new LatLng(20.151516221904394, -98.66832397190912),
                            new LatLng(20.151412983164214, -98.66799406020927),
                            new LatLng(20.15158420835521, -98.66767487734951),
                            new LatLng(20.152395007452636, -98.66692654104776),
                            new LatLng(20.152805441416362, -98.66684339255836),
                            new LatLng(20.15436402236571, -98.66717984733143),
                            new LatLng(20.15467121456661, -98.66705110129715),
                            new LatLng(20.154771933187316, -98.66675874053855),
                            new LatLng(20.1546535888013, -98.66643955769203),
                            new LatLng(20.15296453845028, -98.66549004687914),
                            new LatLng(20.152891516610044, -98.66535057199799),
                            new LatLng(20.152707702860855, -98.66338719505183),
                            new LatLng(20.152803386761438, -98.6631913937653),
                            new LatLng(20.154403664788088, -98.66163997785075),
                            new LatLng(20.15473351859951, -98.66156755820492),
                            new LatLng(20.15577847072903, -98.66175531281813),
                            new LatLng(20.15602774743434, -98.66158365144514),
                            new LatLng(20.15601012182413, -98.6612215532332),
                            new LatLng(20.155826311747678, -98.66097747219372),
                            new LatLng(20.154804021621914, -98.6604973567783),
                            new LatLng(20.154612831983805, -98.66004424065886),
                            new LatLng(20.1548067153446, -98.65960838170479),
                            new LatLng(20.15522973275262, -98.65947695346438),
                            new LatLng(20.156608995288433, -98.65927229090028),
                            new LatLng(20.157054669164072, -98.65878681108707),
                            new LatLng(20.15771613032546, -98.65709078593811),
                            new LatLng(20.15794526063967, -98.65687620918558),
                            new LatLng(20.159085054050472, -98.65622747180134),
                            new LatLng(20.159327324173994, -98.65579703301907),
                            new LatLng(20.159561487884723, -98.65489581080682),
                            new LatLng(20.159750329328585, -98.65472951386157),
                            new LatLng(20.16135073364556, -98.65405800293424),
                            new LatLng(20.161814018941122, -98.65404727409222),
                            new LatLng(20.162438444775386, -98.65435572812073),
                            new LatLng(20.164052023809425, -98.65636946556641),
                            new LatLng(20.16440199969989, -98.6565679490172),
                            new LatLng(20.164643709219607, -98.65652503367383),
                            new LatLng(20.164935774382016, -98.6561978041855),
                            new LatLng(20.164981094790217, -98.6553046286012),//union omitlan
                            new LatLng(20.16484513353124, -98.65502567886412),
                            new LatLng(20.164870311552544, -98.65473600026408),
                            new LatLng(20.165388977861994, -98.65366579891413),
                            new LatLng(20.16517748307218, -98.65361215473824),
                            new LatLng(20.165011308393346, -98.65415127870591),
                            new LatLng(20.164832544526078, -98.65411909220039),
                            new LatLng(20.16497349602262, -98.65335467063643),
                            new LatLng(20.166722987152355, -98.65185950565267),
                            new LatLng(20.167865268646175, -98.65119060997418),
                            new LatLng(20.168371336273253, -98.65060588841685),
                            new LatLng(20.168328534597308, -98.65044227363475),
                            new LatLng(20.168404066960427, -98.65003994228474),
                            new LatLng(20.169572839524395, -98.64851217671242),
                            new LatLng(20.17097140712521, -98.64742331887831),
                            new LatLng(20.172950309415928, -98.64647918130741),
                            new LatLng(20.17471204980867, -98.64530015806955),
                            new LatLng(20.175056966515275, -98.64523310284005),
                            new LatLng(20.175981282159146, -98.64530459544096),
                            new LatLng(20.176940493370612, -98.6455647697081),//elsauz
                            new LatLng(20.17705630325593, -98.64540651936235),
                            new LatLng(20.178440093260203, -98.64439862547016),
                            new LatLng(20.180129399695936, -98.64380686675449),
                            new LatLng(20.182355066994432, -98.64341477427591),
                            new LatLng(20.183112838536353, -98.64320556196763),
                            new LatLng(20.183980197228692, -98.64283786953841),
                            new LatLng(20.18874906297066, -98.63948234250093),
                            new LatLng(20.18944386830881, -98.63908537557046),
                            new LatLng(20.18983406560932, -98.63888420987917),
                            new LatLng(20.1917939556536, -98.638247711438),
                            new LatLng(20.191854372450326, -98.63844083047118),
                            new LatLng(20.18956089603399, -98.63904433846479)



                    )
                    .color(Color.parseColor("#9d0208")).width(10));

            Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(20.176940493370612, -98.6455647697081),
                            new LatLng(20.172799891082892, -98.65010004036604),
                            new LatLng(20.172059693218348, -98.65069817295343),
                            new LatLng(20.16741309549368, -98.65252721667622),
                            new LatLng(20.166388363492324, -98.65310120939644),
                            new LatLng(20.16554639175215, -98.65391323878912),
                            new LatLng(20.16510829552167, -98.65481714324211),
                            new LatLng(20.164981094790217, -98.6553046286012)
                    )
                    .color(Color.parseColor("#9d0208")).width(10));

            Polyline polyline3 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(20.14117699739476, -98.68558013589933),
                            new LatLng(20.141073740852622, -98.68572762432306),
                            new LatLng(20.14065320329413, -98.6860441249608),
                            new LatLng(20.14021755539749, -98.68692925393644),
                            new LatLng(20.14005643430614, -98.68837769304226),
                            new LatLng(20.140076569792836, -98.68992614641346),
                            new LatLng(20.1401898888306, -98.69046527047374),
                            new LatLng(20.140887791678967, -98.69177602405226),
                            new LatLng(20.141159755808182, -98.69248412724562),
                            new LatLng(20.141134573964194, -98.69270675057555),
                            new LatLng(20.141036364731985, -98.69290791625937),
                            new LatLng(20.140661154532616, -98.69337730285216),
                            new LatLng(20.14055539042194, -98.69369916793988),
                            new LatLng(20.140600717905897, -98.69422219867795),
                            new LatLng(20.140570499584467, -98.694391177832),
                            new LatLng(20.14021039746641, -98.69482301348738),
                            new LatLng(20.13974956626432, -98.69517974729676),
                            new LatLng(20.13932147049114, -98.69530581112376),
                            new LatLng(20.138999138784246, -98.69532190436466),
                            new LatLng(20.13889377853439, -98.6952807893844)
                    )
                    .color(Color.parseColor("#9d0208")).width(10));

            Polyline polyline4 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(20.134547163946817, -98.72885207309959),
                            new LatLng(20.13400165404297, -98.7291706418498),
                            new LatLng(20.13354332284178, -98.72954883331282),
                            new LatLng(20.133092545240714, -98.72978486768827),
                            new LatLng(20.132101408484257, -98.72991896215858),
                            new LatLng(20.131721130825266, -98.73005579288606),
                            new LatLng(20.13040630585343, -98.73070721320946),
                            new LatLng(20.129443531517627, -98.73067737103841),
                            new LatLng(20.129413311038657, -98.73037696365344),
                            new LatLng(20.130303681875553, -98.7301554708726)
                    )
                    .color(Color.parseColor("#9d0208")).width(10));

            //PARADAS DESIGNADAS
            Marker D1 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.130271665170937, -98.7301063434271)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D2 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.13135647052985, -98.7274655329943)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D3 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.130205135311474, -98.72554503632739)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D4 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.127527663492216, -98.71989804555483)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D5 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.133809870345956, -98.70682160260483)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D6 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.14158023929787, -98.68542440224442)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D7 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.14337569176953, -98.68504632062566)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D8 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.145409648210844, -98.67297470115476)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D9 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.146451316587026, -98.67171970162754)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D10 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.148200040327158, -98.67083635857806)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D11 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.153284930147684, -98.6758832514383)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D12 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.155402506465908, -98.66087118049161)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D13 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.15746197764768, -98.65756215451601)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D14 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.16214053283248, -98.65407354349377)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D15 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.16489369746273, -98.65424189674506)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D16 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.16827091929601, -98.65045034912018)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D17 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.16946500762883, -98.64852318661585)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D18 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.17014831580884, -98.64799081593256)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D19 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.17692520546464, -98.64546914742716)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D20 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.17927821282843, -98.6440245450547)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D21 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.191775099918395, -98.6381642317163)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D22 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.129536856904423, -98.7303714180119)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));

            //boton de menu
            final FloatingActionButton boton2 = (FloatingActionButton) getView().findViewById(R.id.boton2);
            boton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(D1.isVisible()){
                        D1.setVisible(false);
                        D2.setVisible(false);
                        D3.setVisible(false);
                        D4.setVisible(false);
                        D5.setVisible(false);
                        D6.setVisible(false);
                        D7.setVisible(false);
                        D8.setVisible(false);
                        D9.setVisible(false);
                        D10.setVisible(false);
                        D11.setVisible(false);
                        D12.setVisible(false);
                        D13.setVisible(false);
                        D14.setVisible(false);
                        D15.setVisible(false);
                        D16.setVisible(false);
                        D17.setVisible(false);
                        D18.setVisible(false);
                        D19.setVisible(false);
                        D20.setVisible(false);
                        D21.setVisible(false);
                        D22.setVisible(false);
                        Snackbar.make(view, "Marcadores inhabilitados",Snackbar.LENGTH_LONG).setAction("Action",null).show();

                    }else{
                        D1.setVisible(true);
                        D2.setVisible(true);
                        D3.setVisible(true);
                        D4.setVisible(true);
                        D5.setVisible(true);
                        D6.setVisible(true);
                        D7.setVisible(true);
                        D8.setVisible(true);
                        D9.setVisible(true);
                        D10.setVisible(true);
                        D11.setVisible(true);
                        D12.setVisible(true);
                        D13.setVisible(true);
                        D14.setVisible(true);
                        D15.setVisible(true);
                        D16.setVisible(true);
                        D17.setVisible(true);
                        D18.setVisible(true);
                        D19.setVisible(true);
                        D20.setVisible(true);
                        D21.setVisible(true);
                        D22.setVisible(true);
                        Snackbar.make(view, "Marcadores habilitados",Snackbar.LENGTH_LONG).setAction("Action",null).show();
                    }
                }
            });



        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_r_u_t_a3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}