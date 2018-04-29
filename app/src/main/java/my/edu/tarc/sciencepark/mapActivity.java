package my.edu.tarc.sciencepark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng sciencePark_1 = new LatLng(1.290666, 103.78495);
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));
        googleMap.addMarker(new MarkerOptions().position(sciencePark_1)
                .title("You").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))).showInfoWindow();
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sciencePark_1));

        final LatLng robot=new LatLng(1.291912,103.784743);
        googleMap.addMarker(new MarkerOptions().position(robot)
                .title("Your Food").icon(BitmapDescriptorFactory.fromResource(R.mipmap.robot))).showInfoWindow();

        googleMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));
    }
}
