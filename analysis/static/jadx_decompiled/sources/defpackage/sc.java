package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public class sc {
    public final oc a;
    public final int b;

    public sc(Context context) {
        this(context, tc.g(context, 0));
    }

    public final tc a() {
        tc tcVarCreate = create();
        tcVarCreate.show();
        return tcVarCreate;
    }

    public tc create() {
        oc ocVar = this.a;
        tc tcVar = new tc(ocVar.a, this.b);
        View view = ocVar.e;
        rc rcVar = tcVar.Y;
        if (view != null) {
            rcVar.C = view;
        } else {
            CharSequence charSequence = ocVar.d;
            if (charSequence != null) {
                rcVar.e = charSequence;
                TextView textView = rcVar.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = ocVar.c;
            if (drawable != null) {
                rcVar.y = drawable;
                rcVar.x = 0;
                ImageView imageView = rcVar.z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    rcVar.z.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = ocVar.f;
        if (charSequence2 != null) {
            rcVar.f = charSequence2;
            TextView textView2 = rcVar.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = ocVar.g;
        if (charSequence3 != null) {
            rcVar.c(-1, charSequence3, ocVar.h);
        }
        CharSequence charSequence4 = ocVar.i;
        if (charSequence4 != null) {
            rcVar.c(-2, charSequence4, ocVar.j);
        }
        CharSequence charSequence5 = ocVar.k;
        if (charSequence5 != null) {
            rcVar.c(-3, charSequence5, ocVar.l);
        }
        if (ocVar.p != null || ocVar.q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ocVar.b.inflate(rcVar.G, (ViewGroup) null);
            int i = ocVar.t ? rcVar.H : rcVar.I;
            ListAdapter qcVar = ocVar.q;
            if (qcVar == null) {
                qcVar = new qc(ocVar.a, i, R.id.text1, ocVar.p);
            }
            rcVar.D = qcVar;
            rcVar.E = ocVar.u;
            if (ocVar.r != null) {
                alertController$RecycleListView.setOnItemClickListener(new nc(ocVar, rcVar));
            }
            if (ocVar.t) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            rcVar.g = alertController$RecycleListView;
        }
        View view2 = ocVar.s;
        if (view2 != null) {
            rcVar.h = view2;
            rcVar.i = 0;
            rcVar.j = false;
        }
        tcVar.setCancelable(ocVar.m);
        if (ocVar.m) {
            tcVar.setCanceledOnTouchOutside(true);
        }
        tcVar.setOnCancelListener(null);
        tcVar.setOnDismissListener(ocVar.n);
        DialogInterface.OnKeyListener onKeyListener = ocVar.o;
        if (onKeyListener != null) {
            tcVar.setOnKeyListener(onKeyListener);
        }
        return tcVar;
    }

    public Context getContext() {
        return this.a.a;
    }

    public sc setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        oc ocVar = this.a;
        ocVar.i = ocVar.a.getText(i);
        ocVar.j = onClickListener;
        return this;
    }

    public sc setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        oc ocVar = this.a;
        ocVar.g = ocVar.a.getText(i);
        ocVar.h = onClickListener;
        return this;
    }

    public sc setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public sc setView(View view) {
        this.a.s = view;
        return this;
    }

    public sc(Context context, int i) {
        this.a = new oc(new ContextThemeWrapper(context, tc.g(context, i)));
        this.b = i;
    }
}
