package com.example.task5;


        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {

    private String[] quotes;

    public QuoteAdapter(String[] quotes) {
        this.quotes = quotes;
    }

    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quote, parent, false);
        return new QuoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteViewHolder holder, int position) {
        holder.quoteTextView.setText(quotes[position]);
    }

    @Override
    public int getItemCount() {
        return quotes.length;
    }

    class QuoteViewHolder extends RecyclerView.ViewHolder {

        TextView quoteTextView;

        public QuoteViewHolder(@NonNull View itemView) {
            super(itemView);
            quoteTextView = itemView.findViewById(R.id.quoteTextView);
        }
    }
}
