package com.amaze.filemanager.ui.dialogs;

import android.content.Context;
import android.text.format.Formatter;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

public  class SizeFormatter implements IValueFormatter {

    private Context context;

    public SizeFormatter(Context c) {
        context = c;
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex,
                                    ViewPortHandler viewPortHandler) {
        String prefix = entry.getData() != null && entry.getData() instanceof String?
                (String) entry.getData():"";

        return prefix + Formatter.formatFileSize(context, (long) value);
    }
}
