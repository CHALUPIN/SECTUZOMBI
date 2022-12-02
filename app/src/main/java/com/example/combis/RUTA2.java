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

public class RUTA2 extends Fragment {

    private GoogleMap mapView;
    private OnMapReadyCallback callback = new OnMapReadyCallback() {

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
            //centro de ruta
            mapView.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(20.1061086599066, -98.7487720484454), 17));

            //marker de ruta
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(20.1061086599066, -98.7487720484454))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $13")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue))
            );
            //marker de ruta
            mapView.addMarker(new MarkerOptions()
                    .position(new LatLng(19.97836964188426, -98.68581367098426))
                    .draggable(true)
                    .title("BASE")
                    .snippet("Horario: 6am - 9pm, Precio: $13")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopblue))
            );

            //RUTA
            Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(20.1061086599066, -98.7487720484454),
                            new LatLng(20.105889528613684, -98.74874522635571),
                            new LatLng(20.106196119424936, -98.75064917539872),
                            new LatLng(20.10601602888775, -98.75063978766735),
                            new LatLng(20.105509388607764, -98.74746168933912),
                            new LatLng(20.1052789220469, -98.74718139850187),
                            new LatLng(20.105068605271704, -98.74703387700858),
                            new LatLng(20.089376932312252, -98.74600696853464),
                            new LatLng(20.087447352697986, -98.74585140041103),//GLORIETA
                            new LatLng(20.06184496220229, -98.74412059932493),
                            new LatLng(20.061094161237303, -98.74402940421888),
                            new LatLng(20.058549473510283, -98.74330520778685),
                            new LatLng(20.055335437067463, -98.74168341787993),
                            new LatLng(20.044820663391736, -98.73575118806684),
                            new LatLng(20.037664456883142, -98.7319692733606),
                            new LatLng(20.0368530635913, -98.7313684585302),
                            new LatLng(20.033870816657334, -98.72962037481405),
                            new LatLng(20.02548030125362, -98.72488607936255),
                            new LatLng(20.02225354009349, -98.72309938414804),
                            new LatLng(20.02194104794399, -98.72304573996865),
                            new LatLng(19.99338311794187, -98.70723248261582),
                            new LatLng(19.959267645210804, -98.69442353743129),
                            new LatLng(19.958929816979676, -98.69443426626715),
                            new LatLng(19.95877350815034, -98.69447181719273),
                            new LatLng(19.95865249475675, -98.69457910555148),
                            new LatLng(19.958607114710233, -98.69461665647707),
                            new LatLng(19.95810289109287, -98.6963708211427),
                            new LatLng(19.957870947687773, -98.69653175368082),
                            new LatLng(19.957724722322364, -98.69649420275526),
                            new LatLng(19.95821382042694, -98.69542131916772),
                            new LatLng(19.958405425456665, -98.69456301229768),
                            new LatLng(19.95844351069503, -98.69269855150519),
                            new LatLng(19.958287201383904, -98.69180269370959),
                            new LatLng(19.958398130588403, -98.69151837955889),
                            new LatLng(19.9585998198513, -98.69153983723064),
                            new LatLng(19.958559482019343, -98.69333155282186),
                            new LatLng(19.958650242126748, -98.69365878231605),
                            new LatLng(19.959068746390955, -98.69411475784075),
                            new LatLng(19.961402511166956, -98.69501535125347),
                            new LatLng(19.972293194412753, -98.68771389868336),
                            new LatLng(19.97743879236477, -98.68583270147244),
                            new LatLng(19.977517609817884, -98.68604702316455),
                            new LatLng(19.97836964188426, -98.68581367098426)
                    )
                    .color(Color.parseColor("#240046")).width(10));
            Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                    .clickable(true)
                    .add(
                            new LatLng(19.961401753222606, -98.69501294408933),
                            new LatLng(19.992854071687592, -98.70674686306282),
                            new LatLng(19.99798917037767, -98.70957674987295),
                            new LatLng(20.006956868183458, -98.71455488681077),
                            new LatLng(20.01448324197112, -98.71866539709472),
                            new LatLng(20.0189943254959, -98.72126013136192),
                            new LatLng(20.022094140543164, -98.72287039642436),
                            new LatLng(20.03229386312984, -98.72854442604934),
                            new LatLng(20.03758683467767, -98.73150201263789),
                            new LatLng(20.039243645754617, -98.73249876437042),
                            new LatLng(20.041473162930515, -98.7336784365269),
                            new LatLng(20.041964520687035, -98.73405662799551),
                            new LatLng(20.048010893074164, -98.73728034769981),
                            new LatLng(20.052240057541518, -98.73964980641489),
                            new LatLng(20.058364108921296, -98.74309025994239),
                            new LatLng(20.06048301632612, -98.74373786541778),
                            new LatLng(20.06599787699485, -98.74412779352937),
                            new LatLng(20.07078742290676, -98.74442327345037),
                            new LatLng(20.089258586419696, -98.74581495158927),
                            new LatLng(20.090925189538595, -98.74592302389864),
                            new LatLng(20.105586853503198, -98.74689571024058),
                            new LatLng(20.11009604704186, -98.74703154859802),
                            new LatLng(20.111279824324104, -98.74726221857374),
                            new LatLng(20.112780941790074, -98.74714420137778),
                            new LatLng(20.114203624410425, -98.74659101007603),
                            new LatLng(20.114738200274584, -98.74649914441832),
                            new LatLng(20.113517299390253, -98.74716030892994),
                            new LatLng(20.112393986585055, -98.74742852982811),
                            new LatLng(20.111406673609913, -98.74741243657675),
                            new LatLng(20.111135917053637, -98.74751704272656),
                            new LatLng(20.111032651638983, -98.74761092004046),
                            new LatLng(20.11019934423514, -98.74856225644699),
                            new LatLng(20.109805193984258, -98.74879235052731),
                            new LatLng(20.106934989721186, -98.7488482563783),
                            new LatLng(20.1061086599066, -98.7487720484454)

                    )
                    .color(Color.parseColor("#240046")).width(10));

            //PARADAS DESIGNADAS
            Marker D1 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.10617983298505, -98.7488636677978)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D2 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.105919142392928, -98.74890390092973)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D3 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.105897732997523, -98.75022220658316)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D4 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.104658084270838, -98.74705147595792)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D5 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.070818077567623, -98.74468630982518)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D6 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.058233527811304, -98.74337471618311)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D7 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.0551905792531, -98.74177923473971)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D8 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.051650451357347, -98.73965981621518)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D9 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.04757587653184, -98.73732374181822)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D10 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.01688336013098, -98.72022554716484)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D11 = mapView.addMarker(new MarkerOptions().position(new LatLng(19.997879294176336, -98.70975743826892)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D12 = mapView.addMarker(new MarkerOptions().position(new LatLng(19.990700115088316, -98.7061843627577)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D13 = mapView.addMarker(new MarkerOptions().position(new LatLng(19.961389060438616, -98.6949551431635)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D14 = mapView.addMarker(new MarkerOptions().position(new LatLng(19.97449389910623, -98.68674329840071)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D15 = mapView.addMarker(new MarkerOptions().position(new LatLng(19.97705507219017, -98.68585816945225)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D16 = mapView.addMarker(new MarkerOptions().position(new LatLng(19.978418889646356, -98.68580289647353)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D17 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.021840201848065, -98.72266099535692)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D18 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.041274009710424, -98.7334875595134)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D19 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.055554202295937, -98.74146484573919)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D20 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.07076607783554, -98.74435773343288)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D21 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.078893010475305, -98.74491104303084)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D22 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.08583029383161, -98.74543931819531)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D23 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.092108522297995, -98.74590104214535)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D24 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.10744302966814, -98.74681849462114)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));
            Marker D25 = mapView.addMarker(new MarkerOptions().position(new LatLng(20.113843400576336, -98.74666271248843)).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.busstopgreen)));

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
                        D23.setVisible(false);
                        D24.setVisible(false);
                        D25.setVisible(false);
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
        return inflater.inflate(R.layout.fragment_r_u_t_a2, container, false);
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