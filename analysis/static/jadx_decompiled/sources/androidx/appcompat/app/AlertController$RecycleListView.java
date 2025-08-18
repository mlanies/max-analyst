package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.p3c;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3c.RecycleListView);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p3c.RecycleListView_paddingBottomNoButtons, -1);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p3c.RecycleListView_paddingTopNoTitle, -1);
    }
}
