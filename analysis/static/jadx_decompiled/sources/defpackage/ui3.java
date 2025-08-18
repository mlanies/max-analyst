package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class ui3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public ui3(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i3c.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == i3c.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new dj3().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == i3c.Variant_region_heightLessThan) {
                this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
            } else if (index == i3c.Variant_region_heightMoreThan) {
                this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
            } else if (index == i3c.Variant_region_widthLessThan) {
                this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
            } else if (index == i3c.Variant_region_widthMoreThan) {
                this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
