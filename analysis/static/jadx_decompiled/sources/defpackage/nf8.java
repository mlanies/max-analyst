package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class nf8 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ of8 c;

    public nf8(of8 of8Var, int i, Context context) {
        this.c = of8Var;
        this.a = i;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = of8.F0;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return s36.n(this.b, i);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            of8.F0.put(this.a, drawable.getConstantState());
        }
        this.c.u0 = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawableNewDrawable = (Drawable) obj;
        int i = this.a;
        of8 of8Var = this.c;
        if (drawableNewDrawable != null) {
            of8.F0.put(i, drawableNewDrawable.getConstantState());
            of8Var.u0 = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) of8.F0.get(i);
            if (constantState != null) {
                drawableNewDrawable = constantState.newDrawable();
            }
            of8Var.u0 = null;
        }
        of8Var.setRemoteIndicatorDrawableInternal(drawableNewDrawable);
    }
}
