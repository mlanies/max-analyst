package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class cj3 {
    public static final SparseIntArray n;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        sparseIntArray.append(i3c.Transform_android_rotation, 1);
        sparseIntArray.append(i3c.Transform_android_rotationX, 2);
        sparseIntArray.append(i3c.Transform_android_rotationY, 3);
        sparseIntArray.append(i3c.Transform_android_scaleX, 4);
        sparseIntArray.append(i3c.Transform_android_scaleY, 5);
        sparseIntArray.append(i3c.Transform_android_transformPivotX, 6);
        sparseIntArray.append(i3c.Transform_android_transformPivotY, 7);
        sparseIntArray.append(i3c.Transform_android_translationX, 8);
        sparseIntArray.append(i3c.Transform_android_translationY, 9);
        sparseIntArray.append(i3c.Transform_android_translationZ, 10);
        sparseIntArray.append(i3c.Transform_android_elevation, 11);
        sparseIntArray.append(i3c.Transform_transformPivotTarget, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3c.Transform);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (n.get(index)) {
                case 1:
                    this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
                    break;
                case 2:
                    this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 3:
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 4:
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 11:
                    this.l = true;
                    this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    this.h = dj3.i(typedArrayObtainStyledAttributes, index, this.h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
