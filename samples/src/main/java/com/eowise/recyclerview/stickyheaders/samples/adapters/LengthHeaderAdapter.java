package com.eowise.recyclerview.stickyheaders.samples.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eowise.recyclerview.stickyheaders.StickyHeadersAdapter;
import com.eowise.recyclerview.stickyheaders.samples.R;

/**
 * Created by aurel on 24/09/14.
 */
public class LengthHeaderAdapter implements StickyHeadersAdapter<PersonAdapter.ViewHolder, LengthHeaderAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_header, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder headerViewHolder, PersonAdapter.ViewHolder itemViewHolder, int position) {
        headerViewHolder.title.setText(Integer.toString(itemViewHolder.label.getText().length()));
    }

    @Override
    public long getHeaderId(PersonAdapter.ViewHolder viewHolder, int position) {
        return viewHolder.label.getText().length();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
