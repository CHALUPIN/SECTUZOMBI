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

public class RUTA1 extends Fragment {
    public GoogleMap mapView;


    private final OnMapReadyCallback callback = new OnMapReadyCallback() {

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
            //centro de pachuca
            mapView.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(20.106338611145002, -98.75368196510041), 17));

            //BASE DESIGNADA
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(20.106338611145002, -98.75368196510041))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $10")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue)
                    )
            );
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(20.11288567125929, -98.84371916537529))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $10")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue)
                    )
            );




            //RUTA
            Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(20.106338611145002, -98.75368196510041),
                            new LatLng(20.106490995146515, -98.75363502645148),
                            new LatLng(20.10650862634356, -98.75376913689568),
                            new LatLng(20.10614844577921, -98.75389385961134),
                            new LatLng(20.104969520574667, -98.75418504137997),
                            new LatLng(20.10316607294747, -98.75470002550506),
                            new LatLng(20.10122155025005, -98.75577827354968),
                            new LatLng(20.098339011735614, -98.75789878649023),
                            new LatLng(20.097555910616926, -98.75881072016323),//PARADA
                            new LatLng(20.0971925608374, -98.7593558791331),
                            new LatLng(20.097168631359832, -98.75958923130604),
                            new LatLng(20.097193820283987, -98.75972468286207),
                            new LatLng(20.098476424420646, -98.76110000850736),
                            new LatLng(20.09857591981448, -98.76127166987597),
                            new LatLng(20.098870627329852, -98.76154123189437),
                            new LatLng(20.09897641963202, -98.76160024048983),
                            new LatLng(20.099575908000777, -98.76228286267164),
                            new LatLng(20.10017035657226, -98.76278273613877),
                            new LatLng(20.10035171326366, -98.76276798400819),
                            new LatLng(20.10052677264373, -98.76281894597975),
                            new LatLng(20.100641379755597, -98.76288197788854),
                            new LatLng(20.100784953384856, -98.76302547606674),//PARADA Glorieta
                            new LatLng(20.100922229801935, -98.76339696200787),
                            new LatLng(20.100972203931427, -98.76363963415206),
                            new LatLng(20.101984770888713, -98.76473665763733),
                            new LatLng(20.10204018481545, -98.76486406256878),
                            new LatLng(20.10222292779119, -98.76505977697377),
                            new LatLng(20.102885197885872, -98.76584658438415),
                            new LatLng(20.10361112802997, -98.76657175840995),//PARADA
                            new LatLng(20.108937267622956, -98.77223129942986),
                            new LatLng(20.109157984317182, -98.77228288878685),
                            new LatLng(20.10943504104169, -98.77262084712541),
                            new LatLng(20.11136214306795, -98.77473856999332),
                            new LatLng(20.112606492499257, -98.77598878088844),
                            new LatLng(20.113052336327463, -98.77649916281),
                            new LatLng(20.116863831406114, -98.78083805754466),
                            new LatLng(20.11692384205824, -98.78102908942287),
                            new LatLng(20.120632502568593, -98.78563586451261),
                            new LatLng(20.120907023967778, -98.78583134267822),
                            new LatLng(20.121078282588194, -98.78618002984446),
                            new LatLng(20.12267813899595, -98.78824885164612),
                            new LatLng(20.12276754508277, -98.78866459404207),
                            new LatLng(20.122839664506433, -98.78950018371461),
                            new LatLng(20.122853516142595, -98.7903155752484),
                            new LatLng(20.122757813905807, -98.79146221959606),
                            new LatLng(20.122784692671463, -98.79221635511078),
                            new LatLng(20.122951047541108, -98.79422224083098),
                            new LatLng(20.123433195869467, -98.79733007366774),
                            new LatLng(20.12355173720451, -98.80033612511069),
                            new LatLng(20.12382668046242, -98.80138794192703),
                            new LatLng(20.124145799038867, -98.80209055835793),
                            new LatLng(20.126107368448707, -98.80504257291636),
                            new LatLng(20.126486695125294, -98.80567454200013),
                            new LatLng(20.126681872604237, -98.80628206233474),
                            new LatLng(20.12674357382273, -98.80669780473434),
                            new LatLng(20.12673098173973, -98.80718060234913),
                            new LatLng(20.1266415779186, -98.80765669446204),
                            new LatLng(20.126505583278455, -98.8080925534232),
                            new LatLng(20.119329870098532, -98.82479949018408),
                            new LatLng(20.11927438699811, -98.82521078087532),
                            new LatLng(20.11926934992444, -98.82520139314423),
                            new LatLng(20.11946831421532, -98.82629037000723),
                            new LatLng(20.120162168711303, -98.8276891419784),
                            new LatLng(20.120252835503752, -98.82796138623014),
                            new LatLng(20.120769131471317, -98.82896855569416),
                            new LatLng(20.120876168225845, -98.82942184902676),
                            new LatLng(20.12087257497454, -98.82962603884906),
                            new LatLng(20.120774353012465, -98.82985134439534),
                            new LatLng(20.12063331624107, -98.8299613149596),
                            new LatLng(20.120479686756074, -98.83002300576393),
                            new LatLng(20.12036257565386, -98.83002971128616),
                            new LatLng(20.119902945202064, -98.82990364747124),
                            new LatLng(20.11954595479588, -98.8296632708128),
                            new LatLng(20.11879906677649, -98.82927750499226),
                            new LatLng(20.11856106414515, -98.8290817037437),
                            new LatLng(20.11838350638316, -98.8290884092542),
                            new LatLng(20.118057353667233, -98.828726311042),
                            new LatLng(20.117904980927683, -98.82847016008053),
                            new LatLng(20.117697199685068, -98.82850905210935),
                            new LatLng(20.117422344970027, -98.82750339229811),
                            new LatLng(20.1171528581116, -98.82730759104751),
                            new LatLng(20.116963965176005, -98.82732234319637),
                            new LatLng(20.11597891552406, -98.82826499290954),
                            new LatLng(20.11561546242587, -98.82871543169082),
                            new LatLng(20.11517596685767, -98.82937525507637),
                            new LatLng(20.115230116805286, -98.82952009438871),
                            new LatLng(20.115207449383295, -98.82968773245325),
                            new LatLng(20.11504877735676, -98.82986744045385),
                            new LatLng(20.114877512134562, -98.82989694475158),
                            new LatLng(20.11442641281539, -98.83110983548322),
                            new LatLng(20.11412916530714, -98.83282525943397),
                            new LatLng(20.114218739740796, -98.83816056221525),
                            new LatLng(20.11416081150529, -98.83858703347373),
                            new LatLng(20.113878725908936, -98.8392629501126),
                            new LatLng(20.113463152435397, -98.83969746798677),
                            new LatLng(20.113075282871158, -98.83993886680155),
                            new LatLng(20.112370063033598, -98.84008907049906),
                            new LatLng(20.111974634784126, -98.84009979935136),
                            new LatLng(20.111279484647316, -98.8406214889833),
                            new LatLng(20.111176219324424, -98.8411364731478),
                            new LatLng(20.111297115301888, -98.8415656265693),
                            new LatLng(20.111692545242445, -98.84216912356828),
                            new LatLng(20.111800847535918, -98.84250439967883),
                            new LatLng(20.111828552766088, -98.8428504047008),
                            new LatLng(20.111962041512655, -98.84296573968284),
                            new LatLng(20.112025007863018, -98.84313203663368),
                            new LatLng(20.112002339979806, -98.84325005382459),
                            new LatLng(20.111904112447945, -98.8434002575221),
                            new LatLng(20.111735362441557, -98.8434887704153),
                            new LatLng(20.111543944303545, -98.84341635077541),
                            new LatLng(20.1114280858431, -98.84326614707788),
                            new LatLng(20.1114280858431, -98.84307302803822),
                            new LatLng(20.111516239027335, -98.84291477771403),
                            new LatLng(20.111622022782843, -98.84285576911857),
                            new LatLng(20.111566612253167, -98.84246416662145),
                            new LatLng(20.111443197821064, -98.84210206842207),
                            new LatLng(20.111057841926986, -98.84150393584086),
                            new LatLng(20.110936945761274, -98.84107478239208),
                            new LatLng(20.110962132469474, -98.84073145965488),
                            new LatLng(20.111128364641846, -98.84036131482883),
                            new LatLng(20.11161698545941, -98.83994557245175),
                            new LatLng(20.11224916786798, -98.83987315278969),
                            new LatLng(20.11315084194993, -98.83961834291073),
                            new LatLng(20.113848502409752, -98.83888073540788),
                            new LatLng(20.113994582542443, -98.83825041632007),
                            new LatLng(20.113939167401192, -98.83475075357543),
                            new LatLng(20.11390642530495, -98.8331172883028),
                            new LatLng(20.114114490113163, -98.83122381021902),
                            new LatLng(20.114293312025353, -98.8305800800562),
                            new LatLng(20.114655992460605, -98.82971104433342),
                            new LatLng(20.11462576912545, -98.82954742957615),
                            new LatLng(20.114673622739286, -98.82938113262531),
                            new LatLng(20.114776885750867, -98.82927920868772),
                            new LatLng(20.114953188296052, -98.82923629334556),
                            new LatLng(20.11613973813371, -98.82768930838066),
                            new LatLng(20.116988499753962, -98.82691146777412),
                            new LatLng(20.117026278353407, -98.8265922849169),
                            new LatLng(20.11673916076658, -98.82594587254023),
                            new LatLng(20.116698863519556, -98.82573934245615),
                            new LatLng(20.116477228471858, -98.8253611509653),
                            new LatLng(20.116149812489777, -98.82498564170298),
                            new LatLng(20.115933213844485, -98.82479520484455),
                            new LatLng(20.1149534790266, -98.82366331264298),
                            new LatLng(20.115109632543263, -98.82359357521197),
                            new LatLng(20.116040636410226, -98.82466898360285),
                            new LatLng(20.116614873616662, -98.82515446341093),
                            new LatLng(20.117508966840496, -98.82570968066132),
                            new LatLng(20.117990012075712, -98.8257660070421),
                            new LatLng(20.118483648561803, -98.82564530764232),
                            new LatLng(20.118994913287537, -98.82519201432497),
                            new LatLng(20.12642252541984, -98.80784696290833),
                            new LatLng(20.12655600171137, -98.80740439844242),
                            new LatLng(20.12660888851233, -98.80696451618539),
                            new LatLng(20.12657614906623, -98.80647635416842),
                            new LatLng(20.126311714826826, -98.80567169146406),
                            new LatLng(20.12391928003477, -98.80202281673428),
                            new LatLng(20.123599435030663, -98.80118060309805),
                            new LatLng(20.12333499575396, -98.79996019800706),
                            new LatLng(20.12250796734247, -98.79075653063785),
                            new LatLng(20.122314043894438, -98.78951735005519),
                            new LatLng(20.121806230673364, -98.7875006273195),
                            new LatLng(20.121612306351214, -98.78712243582382),
                            new LatLng(20.11493768800445, -98.7789372538453),
                            new LatLng(20.102742800489597, -98.7659550410642),
                            new LatLng(20.101895058681496, -98.76494822983982),
                            new LatLng(20.100841338862455, -98.7639584713487),
                            new LatLng(20.100418174265233, -98.76392628484209),
                            new LatLng(20.100118431983528, -98.7637519412646),
                            new LatLng(20.099926999635496, -98.76347835594886),
                            new LatLng(20.09988166036144, -98.7632637792381),
                            new LatLng(20.099788462923524, -98.76301165160297),
                            new LatLng(20.097916169685263, -98.76094160917079),
                            new LatLng(20.09677778348527, -98.75969258493386),
                            new LatLng(20.098062416644336, -98.75800547549377),
                            new LatLng(20.100327122696388, -98.75619178108175),
                            new LatLng(20.10311883897274, -98.75449314230906),
                            new LatLng(20.10570603890026, -98.75387383349712),
                            new LatLng(20.106338611145002, -98.75368196510041)
                    )
                    .color(Color.parseColor("#540804")).width(10));
            polyline1.setVisible(true);

            //PARADAS DESIGNADAS
            Marker D1 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.100774, -98.763037)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)) );
            Marker D2 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.097555910616926, -98.75881072016323)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D3 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.103630018945736, -98.76655901791733)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D4 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.106468811276727, -98.76956095435806)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D5 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.108693505711447, -98.77188988853997)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D6 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.111257618469676, -98.77453740432048)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D7 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.112517679941867, -98.7758499721505)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D8 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.11860114657861, -98.78294789202204)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D9 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.120907023967778, -98.78583134267822)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D10 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.123433195869467, -98.79733007366774)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D11 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.123326206798676, -98.81554576555523)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D12 = mapView.addMarker(new MarkerOptions().position(new LatLng(220.1181677911572, -98.82889790334809)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D13 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.117024996183932, -98.82740109816832)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D14 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.116292089716556, -98.82807165041346)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D15 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.114928842939598, -98.82997412388995)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D16 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.114928842939598, -98.82997412388995)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D17 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.11187821215453, -98.84349385982172)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D18 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.120186526346654, -98.82302587361129)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D19 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.115234417288153, -98.82404943765232)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D20 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.115403163525205, -98.82386436521867)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D21 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12310231478233, -98.81548848527983)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D22 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.122832381350655, -98.79690581929772)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D23 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.120665621958416, -98.78602901311463)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D24 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.116789925970323, -98.78115457389974)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D25 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.116789925970323, -98.78115457389974)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D26 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.11016386776383, -98.77389466293447)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D27 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.10846030253683, -98.77209456794557)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D28 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.106367997678067, -98.7698272044273)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D29 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.102587583664477, -98.76583325365942)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D30 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.100065879159715, -98.76377341977151)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D31 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.097029234662973, -98.75928065995738)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D32 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.106222384732828, -98.7536801056406)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));

           // PARADAS NO DESIGNADAS
//            Marker ND1 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.097193820283987, -98.75972468286207)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND2 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.099383976714158, -98.76199279922982)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND3 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.102871508101384, -98.7658223914652)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND4 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.105117305542837, -98.76810887481989)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND5 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.115087867261867, -98.77862742969823)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND6 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.117548366584252, -98.78172487846045)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));

            //MENU DE BOTONES - MARCADORES DESIGANDOS
            final FloatingActionButton boton1 = (FloatingActionButton) getView().findViewById(R.id.boton2);
            boton1.setOnClickListener(new View.OnClickListener() {
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
                        D23.setVisible(false);
                        D24.setVisible(false);
                        D25.setVisible(false);
                        D26.setVisible(false);
                        D27.setVisible(false);
                        D28.setVisible(false);
                        D29.setVisible(false);
                        D30.setVisible(false);
                        D31.setVisible(false);
                        D32.setVisible(false);
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
                        D23.setVisible(true);
                        D24.setVisible(true);
                        D25.setVisible(true);
                        D26.setVisible(true);
                        D27.setVisible(true);
                        D28.setVisible(true);
                        D29.setVisible(true);
                        D30.setVisible(true);
                        D31.setVisible(true);
                        D32.setVisible(true);
                        Snackbar.make(view, "Marcadores habilitados",Snackbar.LENGTH_LONG).setAction("Action",null).show();
                    }
                }
            });

            //MARCADORES NO DESIGNADOS
//            final FloatingActionButton boton2 = (FloatingActionButton) getView().findViewById(R.id.boton1);
//            boton2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    assert ND1 != null;
//                    assert ND2 != null;
//                    assert ND3 != null;
//                    assert ND4 != null;
//                    assert ND5 != null;
//                    assert ND6 != null;
//                    if(ND1.isVisible()&& ND2.isVisible() && ND3.isVisible()&& ND4.isVisible()&& ND5.isVisible()&& ND6.isVisible() ){
//
//                        ND1.setVisible(false);
//                        ND2.setVisible(false);
//                        ND3.setVisible(false);
//                        ND4.setVisible(false);
//                        ND5.setVisible(false);
//                        ND6.setVisible(false);
//                        Snackbar.make(view, "Marcadores inhabilitados",Snackbar.LENGTH_LONG).setAction("Action",null).show();
//
//                    }else{
//                        ND1.setVisible(true);
//                        ND2.setVisible(true);
//                        ND3.setVisible(true);
//                        ND4.setVisible(true);
//                        ND5.setVisible(true);
//                        ND6.setVisible(true);
//                        Snackbar.make(view, "Marcadores habilitados",Snackbar.LENGTH_LONG).setAction("Action",null).show();
//
//                    }
//                }
//            });

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_r_u_t_a1, container, false);
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