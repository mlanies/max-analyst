package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.ee4;
import defpackage.fm9;
import defpackage.fpc;
import defpackage.hm9;
import defpackage.khe;
import defpackage.sme;
import defpackage.tu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/views/widgets/VideoInfoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class VideoInfoTextView extends AppCompatTextView {
    public VideoInfoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public VideoInfoTextView(Context context, AttributeSet attributeSet, int i) {
        sme smeVarR;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context2);
        }
        setTextColor(smeVarR.t);
        setTextSize(0, getContext().getResources().getDimensionPixelSize(fpc.c));
        float f = 4;
        float f2 = 2;
        setPadding(tu0.G(getContext().getResources().getDisplayMetrics().density * f), tu0.G(getContext().getResources().getDisplayMetrics().density * f2), tu0.G(getContext().getResources().getDisplayMetrics().density * f), tu0.G(f2 * getContext().getResources().getDisplayMetrics().density));
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(tu0.G(f * getContext().getResources().getDisplayMetrics().density));
        setGravity(8388627);
        setBackground(hm9.b0(Integer.valueOf(smeVarR.r), null, null, tu0.G(16 * getContext().getResources().getDisplayMetrics().density)));
    }
}
