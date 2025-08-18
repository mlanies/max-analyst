package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rc {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final pc K;
    public final Context a;
    public final fn b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController$RecycleListView g;
    public View h;
    public int i;
    public Button k;
    public CharSequence l;
    public Message m;
    public Drawable n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public NestedScrollView w;
    public Drawable y;
    public ImageView z;
    public boolean j = false;
    public int x = 0;
    public int E = -1;
    public final e0d L = new e0d(2, this);

    public rc(Context context, fn fnVar, Window window) {
        this.a = context;
        this.b = fnVar;
        this.c = window;
        pc pcVar = new pc();
        pcVar.b = new WeakReference(fnVar);
        this.K = pcVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p3c.AlertDialog, vsb.alertDialogStyle, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(p3c.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(p3c.AlertDialog_buttonPanelSideLayout, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(p3c.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(p3c.AlertDialog_multiChoiceItemLayout, 0);
        this.H = typedArrayObtainStyledAttributes.getResourceId(p3c.AlertDialog_singleChoiceItemLayout, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(p3c.AlertDialog_listItemLayout, 0);
        this.J = typedArrayObtainStyledAttributes.getBoolean(p3c.AlertDialog_showTitle, true);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        fnVar.d().f(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.K.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.t = charSequence;
            this.u = messageObtainMessage;
            this.v = null;
        } else if (i == -2) {
            this.p = charSequence;
            this.q = messageObtainMessage;
            this.r = null;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.l = charSequence;
            this.m = messageObtainMessage;
            this.n = null;
        }
    }
}
