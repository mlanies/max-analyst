package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pf8 extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final Drawable X;
    public final LayoutInflater a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable o;

    public pf8(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{qsb.mediaRouteDefaultIconDrawable, qsb.mediaRouteTvIconDrawable, qsb.mediaRouteSpeakerIconDrawable, qsb.mediaRouteSpeakerGroupIconDrawable});
        this.b = s36.n(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        this.c = s36.n(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.o = s36.n(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.X = s36.n(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lb
            android.view.LayoutInflater r8 = r6.a
            int r1 = defpackage.syb.mr_chooser_list_item
            android.view.View r8 = r8.inflate(r1, r9, r0)
        Lb:
            java.lang.Object r7 = r6.getItem(r7)
            dh8 r7 = (defpackage.dh8) r7
            int r9 = defpackage.dvb.mr_chooser_route_name
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r1 = defpackage.dvb.mr_chooser_route_desc
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.d
            r9.setText(r2)
            java.lang.String r2 = r7.e
            int r3 = r7.h
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L30
            if (r3 != r4) goto L42
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L42
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L51
        L42:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L51:
            boolean r9 = r7.g
            r8.setEnabled(r9)
            int r9 = defpackage.dvb.mr_chooser_route_icon
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L97
            android.net.Uri r0 = r7.f
            if (r0 == 0) goto L7b
            android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L78
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L78
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L78
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L78
            if (r0 == 0) goto L7b
            goto L94
        L78:
            r0.toString()
        L7b:
            int r0 = r7.m
            if (r0 == r4) goto L91
            if (r0 == r5) goto L8e
            boolean r7 = r7.e()
            if (r7 == 0) goto L8b
            android.graphics.drawable.Drawable r6 = r6.X
        L89:
            r0 = r6
            goto L94
        L8b:
            android.graphics.drawable.Drawable r6 = r6.b
            goto L89
        L8e:
            android.graphics.drawable.Drawable r6 = r6.o
            goto L89
        L91:
            android.graphics.drawable.Drawable r6 = r6.c
            goto L89
        L94:
            r9.setImageDrawable(r0)
        L97:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf8.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((dh8) getItem(i)).g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dh8 dh8Var = (dh8) getItem(i);
        if (dh8Var.g) {
            ImageView imageView = (ImageView) view.findViewById(dvb.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(dvb.mr_chooser_route_progress_bar);
            if (imageView != null && progressBar != null) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            dh8Var.l();
        }
    }
}
