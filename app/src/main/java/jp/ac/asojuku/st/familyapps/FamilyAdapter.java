
package jp.ac.asojuku.st.familyapps;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import jp.ac.asojuku.st.familyapps.FamilyData;
import jp.ac.asojuku.st.familyapps.FamilyViewHolder;

public class FamilyAdapter extends RecyclerView.Adapter<FamilyViewHolder> {
    private ArrayList<FamilyData> rouletteDataSet;
    private Activity activity;

    public FamilyAdapter(ArrayList<FamilyData> roulette, Activity activity) {
        this.activity = activity;
        this.rouletteDataSet = roulette;
    }


    public FamilyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        return new FamilyViewHolder(view);
    }

    public void onBindViewHolder(final FamilyViewHolder holder, final int listPosition) {
        holder.base.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("mailto:");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra(Intent.EXTRA_SUBJECT, "やること");
                intent.putExtra(Intent.EXTRA_TEXT, rouletteDataSet.get(listPosition).getComment());
                activity.startActivity(intent);
            }
        });
    }


    public int getItemCount() {
        return rouletteDataSet.size();
    }

}