package cloud.mockingbird.popularmovieapp;

import android.support.v4.app.Fragment;

public class MovieListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new MovieListFragment();
    }
}
