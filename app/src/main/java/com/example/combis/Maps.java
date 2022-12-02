package com.example.combis;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.JointType;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.material.snackbar.Snackbar;

public class Maps extends Fragment {

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
            //centro de pachuca
            mapView.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(20.098307,-98.761237), 17));

            //marker de las bases
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(20.098249790454968, -98.7613303461143))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $10")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue))
            );
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(20.129155507360494, -98.73005324695127))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $10")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue))
            );

            //RUTA
            Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(20.098249790454968, -98.7613303461143),
                            new LatLng(20.096836, -98.759656),
                            new LatLng(20.096957, -98.759473),
                            new LatLng(20.097304, -98.759942),
                            new LatLng(20.099316, -98.761953),
                            new LatLng(20.100168, -98.762812),
                            new LatLng(20.100403, -98.762798),
                            new LatLng(20.100598, -98.762856),
                            new LatLng(20.100774, -98.763037),//GLORIETA
                            new LatLng(20.100907, -98.763371),
                            new LatLng(20.100955, -98.763638),
                            new LatLng(20.102013, -98.764815),
                            new LatLng(20.102763, -98.765715),
                            new LatLng(20.10289262877483, -98.76583571904533),
                            new LatLng(20.103638250943085, -98.7665880661035),//Parada
                            new LatLng(20.108942461439185, -98.77223035794621),
                            new LatLng(20.10916158845755, -98.77229473096146),
                            new LatLng(20.112301967697384, -98.77568926087687),
                            new LatLng(20.11259916800769, -98.7756704854117),
                            new LatLng(20.11268543155092, -98.77554710379782),
                            new LatLng(20.11277736199011, -98.77532179824074),
                            new LatLng(20.113501466085427, -98.77016823028798),
                            new LatLng(20.11423343029451, -98.76457089168015),
                            new LatLng(20.114467661591366, -98.7622346876337),
                            new LatLng(20.11424602338632, -98.76104915125197),
                            new LatLng(20.11480515552849, -98.76093113405733),
                            new LatLng(20.114640178910268, -98.76252983716795),
                            new LatLng(20.115793698701623, -98.76267467645454),
                            new LatLng(20.116184080104276, -98.76263712552898),
                            new LatLng(20.120293107222892, -98.76320677274818),
                            new LatLng(20.120449255409053, -98.76327651018138),
                            new LatLng(20.120902587987096, -98.76334892982528),
                            new LatLng(20.12455337639568, -98.76383614526132),
                            new LatLng(20.124680305188903, -98.75826516118413),
                            new LatLng(20.124662676041762, -98.75693478551206),
                            new LatLng(20.12489437327782, -98.75286319224139),
                            new LatLng(20.12521524264198, -98.75100334318448),
                            new LatLng(20.125185021345647, -98.75083168181047),
                            new LatLng(20.12540916248969, -98.74955226812247),
                            new LatLng(20.12426830589355, -98.74933500918844),
                            new LatLng(20.123782243058958, -98.74926795396422),
                            new LatLng(20.123238253834497, -98.74913116130176),
                            new LatLng(20.124465828184942, -98.74161299490066),
                            new LatLng(20.124601824600806, -98.74051060698918),
                            new LatLng(20.125032479126066, -98.73936262153173),
                            new LatLng(20.12255563359444, -98.73744409077688),
                            new LatLng(20.1220620099461, -98.73690764896915),
                            new LatLng(20.120999719038558, -98.73611326262042),
                            new LatLng(20.120868756515215, -98.73617763563567),
                            new LatLng(20.120722682802104, -98.73609180494867),
                            new LatLng(20.12068994212355, -98.73596305891816),
                            new LatLng(20.120712797836593, -98.73587212535013),
                            new LatLng(20.120790871739647, -98.73579165908107),
                            new LatLng(20.120918056566303, -98.73576349588511),
                            new LatLng(20.12133235097058, -98.73528472157997),
                            new LatLng(20.121325036377765, -98.73529402906537),
                            new LatLng(20.122019862715394, -98.73430405496414),
                            new LatLng(20.122182964363194, -98.73393752797807),
                            new LatLng(20.1223202220076, -98.733202602711),
                            new LatLng(20.122215704731023, -98.73275601491027),
                            new LatLng(20.12202681790633, -98.73248242958392),
                            new LatLng(20.12150549922455, -98.73116418656089),
                            new LatLng(20.124224446080053, -98.73019003961625),
                            new LatLng(20.125574333279445, -98.73034292552866),
                            new LatLng(20.125667515358977, -98.73037511203627),
                            new LatLng(20.127002279616466, -98.73033756110787),
                            new LatLng(20.127533663730578, -98.73029196355205),
                            new LatLng(20.12801719650682, -98.7302356371637),
                            new LatLng(20.128223704848452, -98.73004520032399),
                            new LatLng(20.128845746603414, -98.73008006904098),
                            new LatLng(20.129090029528037, -98.72999692056294),
                            new LatLng(20.129163062493237, -98.73022759053427),
                            new LatLng(20.128338777155864, -98.73051559649325),
                            new LatLng(20.127957240476327, -98.73068725787043),
                            new LatLng(20.1265867426092, -98.73093222529782),
                            new LatLng(20.125887593116136, -98.73091866457324),
                            new LatLng(20.12549975436384, -98.73070274674757),
                            new LatLng(20.124894209889202, -98.73074495877933),
                            new LatLng(20.124024165171335, -98.73106445452979),
                            new LatLng(20.123327809331332, -98.73126964352483),
                            new LatLng(20.122928359740715, -98.73147376538257),
                            new LatLng(20.12080190322913, -98.7321425467492),
                            new LatLng(20.120838421650777, -98.73272056278552),
                            new LatLng(20.121003384074694, -98.7337545543542),
                            new LatLng(20.12186222051908, -98.73453571638665),
                            new LatLng(20.12249537700065, -98.73507872045269),
                            new LatLng(20.122821374005756, -98.73528457348179),
                            new LatLng(20.123236189190617, -98.73532584838483),
                            new LatLng(20.123468447465182, -98.7364041470777),
                            new LatLng(20.12399448029989, -98.73687985172873),
                            new LatLng(20.124740602833832, -98.73737438673267),
                            new LatLng(20.12630925896106, -98.73859922539773),
                            new LatLng(20.126184862357906, -98.73948873818405),
                            new LatLng(20.126175167284693, -98.74027504729415),
                            new LatLng(20.12637561880948, -98.74423647555138),
                            new LatLng(20.12624790407122, -98.74534308531041),
                            new LatLng(20.12572508073175, -98.7485418197777),
                            new LatLng(20.125757820356093, -98.74862765046471),
                            new LatLng(20.125051325080673, -98.75300206117704),
                            new LatLng(20.1248186875016, -98.75716467082911),
                            new LatLng(20.124754340211748, -98.76377403197998),
                            new LatLng(20.12454782728933, -98.76385718045478),
                            new LatLng(20.120631248029497, -98.76333631188798),
                            new LatLng(20.12042976669419, -98.76329071433531),
                            new LatLng(20.120258507363634, -98.76330412538016),
                            new LatLng(20.11615781215941, -98.76274823999564),
                            new LatLng(20.1157674306912, -98.76281529521987),
                            new LatLng(20.11461803543106, -98.76263677379215),
                            new LatLng(20.112833479596542, -98.77625039866817),
                            new LatLng(20.11250857462593, -98.77628526738944),
                            new LatLng(20.110339670698426, -98.77404822982179),
                            new LatLng(20.110264110259585, -98.77382292426418),
                            new LatLng(20.102738164626793, -98.76596037882999),
                            new LatLng(20.10211952244087, -98.76521418509138),
                            new LatLng(20.101925573725907, -98.76515517649406),
                            new LatLng(20.100792102392294, -98.76398841558236),
                            new LatLng(20.10041175794181, -98.7639294069817),
                            new LatLng(20.100195137514888, -98.7638248008281),
                            new LatLng(20.10004148796278, -98.76367191491687),
                            new LatLng(20.09989791365486, -98.76339296518411),
                            new LatLng(20.099792121975316, -98.76301209151052),
                            new LatLng(20.098249790454968, -98.7613303461143)


                    )
                    .geodesic(true)
                    .color(Color.parseColor("#386641")).width(10));
            polyline1.setVisible(true);
            polyline1.setJointType(JointType.ROUND);


            //PARADAS DESIGNADAS
            Marker D1 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.100774, -98.763037)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D2 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.102763, -98.765715)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D3 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.103735511541046, -98.76662449600232)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D4 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.106442238204295, -98.76951261647189)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D5 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.108643398962073, -98.77184643526058)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D6 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.111255841860686, -98.77452992158996)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D7 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.113082989670854, -98.77290232747153)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D8 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.113447006279053, -98.77024360225913)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D9 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.11442183729897, -98.76220704375724)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D10 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.114675373045397, -98.76249403214884)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D11 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.120510383963026, -98.76332020059974)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D12 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.123190063027465, -98.76368498102735)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D13 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.124407313225127, -98.76377761827872)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D14 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.124619103775345, -98.75892287649428)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D15 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12463626256542, -98.75676779167125)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D16 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12510893466794, -98.75142437964307)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D17 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.124012683419124, -98.74397838147893)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D18 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12195143971017, -98.73684080947034)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D19 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.121968556929442, -98.73427914991804)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D20 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.121697268084322, -98.73177644894837)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D21 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12638250114672, -98.73032503925839)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D22 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.128672356104303, -98.73003671184564)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D23 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.1284081643223, -98.73053084745494)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D24 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12747002169822, -98.73080220113236)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D25 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12749341894946, -98.73077951558447)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D26 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.121707956238755, -98.73189320124192)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D27 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12206603820445, -98.73466277462163)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D28 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.124052816322767, -98.73687766439608)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D29 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.126274145480256, -98.73901286275816)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D30 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.126399862890125, -98.74425769793707)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D31 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12598683317575, -98.74704444887053)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D32 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.125746741082924, -98.74884912403823)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D33 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.125328440189676, -98.75149557543912)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D34 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12486964743716, -98.75696078443049)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D35 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.124970483901144, -98.75855138183134)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D36 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12483782483191, -98.7628679441186)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D37 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.124083533680874, -98.7638168594283)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D38 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.123160865275153, -98.76368945496746)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D39 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.120661888221075, -98.76334200286783)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D40 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.11918577335876, -98.76318273711753)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D41 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.115811189977595, -98.76284672572058)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D42 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.114633390786697, -98.76266501486018)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D43 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.114410169488774, -98.76446475940841)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D44 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.114065550030777, -98.76719460808609)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D45 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.11371339070717, -98.76997184220012)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D46 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.113549353972527, -98.77116105426065)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D47 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.113308135165937, -98.77284398173117)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D48 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.110177983382822, -98.7738922739736)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D49 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.108472892067994, -98.77206422253086)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D50 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.106383687614823, -98.76981876375115)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D51 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.102594697032668, -98.76581682248255)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D52 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.100084889715657, -98.76376521609252)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));



            //PARADAS NO DESIGNADAS
//            Marker ND1 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.100168, -98.762812)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND2 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.102871565228725, -98.76578496458026)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND3 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.105041465967194, -98.7680273054769)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND4 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.113198920963686, -98.77208627984594)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND5 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.113507788489677, -98.76991220333939)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND6 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.11433925336818, -98.76096074767648)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND7 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.125370872774567, -98.74960033971591)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND8 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.123218650046265, -98.74902159268433)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND9 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.12329428131532, -98.73801167085206)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));
//            Marker ND10 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.120610674406382, -98.73594703181938)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopred)));



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
                        D33.setVisible(false);
                        D34.setVisible(false);
                        D35.setVisible(false);
                        D36.setVisible(false);
                        D37.setVisible(false);
                        D38.setVisible(false);
                        D39.setVisible(false);
                        D40.setVisible(false);
                        D41.setVisible(false);
                        D42.setVisible(false);
                        D43.setVisible(false);
                        D44.setVisible(false);
                        D45.setVisible(false);
                        D46.setVisible(false);
                        D47.setVisible(false);
                        D48.setVisible(false);
                        D49.setVisible(false);
                        D50.setVisible(false);
                        D51.setVisible(false);
                        D52.setVisible(false);
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
                        D33.setVisible(true);
                        D34.setVisible(true);
                        D35.setVisible(true);
                        D36.setVisible(true);
                        D37.setVisible(true);
                        D38.setVisible(true);
                        D39.setVisible(true);
                        D40.setVisible(true);
                        D41.setVisible(true);
                        D42.setVisible(true);
                        D43.setVisible(true);
                        D44.setVisible(true);
                        D45.setVisible(true);
                        D46.setVisible(true);
                        D47.setVisible(true);
                        D48.setVisible(true);
                        D49.setVisible(true);
                        D50.setVisible(true);
                        D51.setVisible(true);
                        D52.setVisible(true);
                        Snackbar.make(view, "Marcadores habilitados",Snackbar.LENGTH_LONG).setAction("Action",null).show();
                    }
                }
            });

            //MARCADORES NO DESIGNADOS
//            final FloatingActionButton boton2 = (FloatingActionButton) getView().findViewById(R.id.boton1);
//            boton2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if(ND1.isVisible()){
//
//                        ND1.setVisible(false);
//                        Snackbar.make(view, "Marcadores inhabilitados",Snackbar.LENGTH_LONG).setAction("Action",null).show();
//
//                    }else{
//
//                        ND1.setVisible(true);
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
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }else{
           mapFragment.onDestroy();
        }
    }


}