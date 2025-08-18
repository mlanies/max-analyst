package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;
import ru.ok.tamtam.photoeditor.view.colorselector.ColorSelectorView;

/* loaded from: classes2.dex */
public final class ewa implements View.OnClickListener, o63 {
    public static final int[] x0 = {-1, -16777216, -1226410, -160462, -144548, -9387952, -13068304, -9863937, -6092870, -3078039, -1210994, -11565, -140617, -15486, -2977978, -6724551, -12377308, -14923223, -14277082, -13224394, -11184811, -9211021, -6710887, -5066062, -3684409, -2368549, -1052689};
    public final ImageButton X;
    public final ImageButton Y;
    public final TextView Z;
    public final HashSet a = new HashSet();
    public final View b;
    public final jp c;
    public final ImageButton o;
    public final ImageButton s0;
    public final yr0 t0;
    public final AppCompatTextView u0;
    public cwa v0;
    public Toast w0;

    public ewa(View view, jp jpVar) {
        this.b = view;
        this.c = jpVar;
        ImageButton imageButton = (ImageButton) view.findViewById(xxb.act_photo_editor__btn_sticker);
        this.o = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) view.findViewById(xxb.act_photo_editor__btn_undo);
        this.X = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) view.findViewById(xxb.act_photo_editor__btn_done);
        this.Y = imageButton3;
        imageButton3.setOnClickListener(this);
        ImageButton imageButton4 = (ImageButton) view.findViewById(xxb.act_photo_editor__btn_close);
        imageButton4.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(xxb.act_photo_editor__btn_clear);
        this.Z = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton5 = (ImageButton) view.findViewById(xxb.act_photo_editor__btn_line_width);
        this.s0 = imageButton5;
        imageButton5.setOnClickListener(this);
        view.findViewById(xxb.act_photo_editor__fl_line_width).setOnClickListener(this);
        ColorSelectorView colorSelectorView = (ColorSelectorView) view.findViewById(xxb.act_photo_editor__view_color_selector);
        colorSelectorView.setColors(x0);
        colorSelectorView.setListener(this);
        yr0 yr0Var = (yr0) view.findViewById(xxb.act_photo_editor__view_brush_width);
        this.t0 = yr0Var;
        ((BrushWidthViewImpl) yr0Var).D0.add(this);
        Context context = view.getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        view.setBackgroundColor(smeVarR.m);
        View viewFindViewById = view.findViewById(xxb.act_photo_editor__rl_buttons);
        int i = smeVarR.H;
        viewFindViewById.setBackgroundColor(i);
        view.findViewById(xxb.act_photo_editor__rl_controls).setBackgroundColor(i);
        view.findViewById(xxb.act_photo_editor__editor).setBackgroundColor(i);
        int i2 = smeVarR.w;
        imageButton4.setColorFilter(i2);
        imageButton4.setBackground(smeVarR.a());
        imageButton3.setColorFilter(smeVarR.k);
        imageButton3.setBackground(smeVarR.a());
        imageButton2.setColorFilter(i2);
        imageButton2.setBackground(smeVarR.a());
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{smeVarR.M, smeVarR.F}));
        textView.setBackground(hm9.L(0, smeVarR.i));
        Context context2 = view.getContext();
        bk4 bk4VarB = bk4.b();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
        this.u0 = appCompatTextView;
        appCompatTextView.setBackgroundColor(Color.parseColor("#404040"));
        this.u0.setTextColor(-1);
        AppCompatTextView appCompatTextView2 = this.u0;
        int i3 = bk4VarB.k;
        appCompatTextView2.setPadding(i3, i3, i3, i3);
        Resources resources = context2.getResources();
        int i4 = gpc.M;
        ThreadLocal threadLocal = vic.a;
        Drawable drawableA = qic.a(resources, i4, null);
        drawableA.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.u0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
        this.u0.setCompoundDrawablePadding(bk4VarB.h);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = bk4VarB.i;
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.setColorFilter(Color.parseColor("#404040"), PorterDuff.Mode.SRC);
        this.u0.setBackground(shapeDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.cwa r11) {
        /*
            r10 = this;
            boolean r0 = r11.b
            r1 = 1
            r0 = r0 ^ r1
            android.widget.ImageButton r2 = r10.X
            defpackage.j47.Q(r2, r0)
            boolean r0 = r11.c
            r2 = 0
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = 4
        L11:
            android.widget.TextView r3 = r10.Z
            r3.setVisibility(r0)
            android.widget.ImageButton r0 = r10.Y
            boolean r3 = r11.Y
            r0.setEnabled(r3)
            if (r3 == 0) goto L22
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L25
        L22:
            r3 = 1050253722(0x3e99999a, float:0.3)
        L25:
            r0.setAlpha(r3)
            cwa r3 = r10.v0
            r4 = 0
            android.widget.ImageButton r5 = r10.o
            boolean r6 = r11.X
            boolean r7 = r11.o
            if (r3 == 0) goto L47
            boolean r8 = r3.X
            if (r8 == 0) goto L3d
            boolean r8 = r3.o
            if (r8 == 0) goto L3d
            r8 = r1
            goto L3e
        L3d:
            r8 = r2
        L3e:
            if (r7 == 0) goto L44
            if (r6 == 0) goto L44
            r9 = r1
            goto L45
        L44:
            r9 = r2
        L45:
            if (r8 == r9) goto La5
        L47:
            if (r7 == 0) goto L4c
            if (r6 == 0) goto L4c
            goto L4d
        L4c:
            r1 = r2
        L4d:
            if (r3 == 0) goto L80
            android.widget.Toast r3 = r10.w0
            if (r3 == 0) goto L58
            r3.cancel()
            r10.w0 = r4
        L58:
            androidx.appcompat.widget.AppCompatTextView r3 = r10.u0
            if (r1 == 0) goto L5f
            int r6 = defpackage.jpc.p2
            goto L61
        L5f:
            int r6 = defpackage.jpc.o2
        L61:
            r3.setText(r6)
            android.widget.Toast r3 = new android.widget.Toast
            android.content.Context r6 = r5.getContext()
            r3.<init>(r6)
            r10.w0 = r3
            r6 = 17
            r3.setGravity(r6, r2, r2)
            android.widget.Toast r3 = r10.w0
            androidx.appcompat.widget.AppCompatTextView r6 = r10.u0
            r3.setView(r6)
            android.widget.Toast r3 = r10.w0
            r3.show()
        L80:
            if (r1 == 0) goto L94
            int r1 = defpackage.gpc.y
            r5.setImageResource(r1)
            boolean r1 = r11.Z
            if (r1 == 0) goto L8e
            int r1 = defpackage.gpc.f0
            goto L90
        L8e:
            int r1 = defpackage.gpc.T
        L90:
            r0.setImageResource(r1)
            goto La5
        L94:
            r5.setBackgroundColor(r2)
            r1 = -1
            r5.setColorFilter(r1)
            int r1 = defpackage.gpc.x
            r5.setImageResource(r1)
            int r1 = defpackage.gpc.n
            r0.setImageResource(r1)
        La5:
            cwa r0 = r10.v0
            if (r0 == 0) goto Lad
            boolean r0 = r0.o
            if (r0 == r7) goto Lbb
        Lad:
            if (r7 == 0) goto Lb0
            goto Lb2
        Lb0:
            r2 = 8
        Lb2:
            r5.setVisibility(r2)
            if (r7 == 0) goto Lb8
            r4 = r10
        Lb8:
            r5.setOnClickListener(r4)
        Lbb:
            r10.v0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewa.a(cwa):void");
    }

    public final void b(tj3 tj3Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            tj3Var.accept((zva) it.next());
        }
    }

    public final void c(int i) {
        float[] fArr = new float[3];
        ThreadLocal threadLocal = s63.a;
        s63.a(Color.red(i), Color.green(i), Color.blue(i), fArr);
        int i2 = fArr[2] < 0.9f ? -1 : -16777216;
        ImageButton imageButton = this.s0;
        imageButton.setColorFilter(i2);
        imageButton.setBackground(hm9.S(Integer.valueOf(i), null, null));
        this.t0.setPreviewColor(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zva) it.next()).b.f = i;
        }
        this.c.k(i, "app.editor.color");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == xxb.act_photo_editor__btn_undo) {
            b(new al9(14));
            return;
        }
        if (id == xxb.act_photo_editor__btn_close) {
            b(new al9(15));
            return;
        }
        if (id == xxb.act_photo_editor__btn_done) {
            b(new al9(16));
            return;
        }
        if (id == xxb.act_photo_editor__btn_clear) {
            b(new al9(17));
            return;
        }
        if (id == xxb.act_photo_editor__btn_line_width) {
            BrushWidthViewImpl brushWidthViewImpl = (BrushWidthViewImpl) this.t0;
            brushWidthViewImpl.setVisibility(brushWidthViewImpl.getVisibility() == 0 ? 8 : 0);
        } else if (id == xxb.act_photo_editor__btn_sticker) {
            b(new al9(18));
        }
    }
}
