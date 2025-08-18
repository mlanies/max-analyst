package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pg8 extends fn {
    public static final /* synthetic */ int e1 = 0;
    public boolean A0;
    public long B0;
    public final cy C0;
    public RecyclerView D0;
    public ng8 E0;
    public og8 F0;
    public HashMap G0;
    public dh8 H0;
    public HashMap I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public ImageButton M0;
    public Button N0;
    public ImageView O0;
    public View P0;
    public ImageView Q0;
    public TextView R0;
    public TextView S0;
    public String T0;
    public MediaControllerCompat U0;
    public final jg8 V0;
    public MediaDescriptionCompat W0;
    public ig8 X0;
    public final eh8 Y;
    public Bitmap Y0;
    public final mf8 Z;
    public Uri Z0;
    public boolean a1;
    public Bitmap b1;
    public int c1;
    public final boolean d1;
    public wg8 s0;
    public dh8 t0;
    public final ArrayList u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public final Context y0;
    public boolean z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public pg8(Context context) {
        boolean z = false;
        ContextThemeWrapper contextThemeWrapperA = lh8.a(context, false);
        super(contextThemeWrapperA, lh8.b(contextThemeWrapperA));
        this.s0 = wg8.c;
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.C0 = new cy(10, this);
        Context context2 = getContext();
        this.y0 = context2;
        this.Y = eh8.d(context2);
        if (eh8.d != null) {
            eh8.c().getClass();
            z = true;
        }
        this.d1 = z;
        this.Z = new mf8(this, 4);
        eh8.b();
        this.t0 = eh8.c().f();
        this.V0 = new jg8(this);
        i();
    }

    public final void g(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            dh8 dh8Var = (dh8) list.get(size);
            if (dh8Var.d() || !dh8Var.g || !dh8Var.h(this.s0) || this.t0 == dh8Var) {
                list.remove(size);
            }
        }
    }

    public final void h() {
        MediaDescriptionCompat mediaDescriptionCompat = this.W0;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.W0;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        ig8 ig8Var = this.X0;
        Bitmap bitmap = ig8Var == null ? this.Y0 : ig8Var.a;
        Uri uri = ig8Var == null ? this.Z0 : ig8Var.b;
        if (bitmap != iconBitmap || (bitmap == null && !Objects.equals(uri, iconUri))) {
            ig8 ig8Var2 = this.X0;
            if (ig8Var2 != null) {
                ig8Var2.cancel(true);
            }
            ig8 ig8Var3 = new ig8(this);
            this.X0 = ig8Var3;
            ig8Var3.execute(new Void[0]);
        }
    }

    public final void i() {
        MediaControllerCompat mediaControllerCompat = this.U0;
        jg8 jg8Var = this.V0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(jg8Var);
            this.U0 = null;
        }
    }

    public final void j(wg8 wg8Var) {
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.s0.equals(wg8Var)) {
            return;
        }
        this.s0 = wg8Var;
        if (this.A0) {
            eh8 eh8Var = this.Y;
            mf8 mf8Var = this.Z;
            eh8Var.f(mf8Var);
            eh8Var.a(wg8Var, mf8Var, 1);
            m();
        }
    }

    public final void k() {
        Context context = this.y0;
        getWindow().setLayout(!context.getResources().getBoolean(wsb.is_tablet) ? -1 : dy7.v(context), context.getResources().getBoolean(wsb.is_tablet) ? -2 : -1);
        this.Y0 = null;
        this.Z0 = null;
        h();
        l();
        n();
    }

    public final void l() {
        Bitmap bitmap;
        if ((this.H0 != null || this.J0) ? true : !this.z0) {
            this.L0 = true;
            return;
        }
        this.L0 = false;
        if (!this.t0.g() || this.t0.d()) {
            dismiss();
        }
        if (!this.a1 || (((bitmap = this.b1) != null && bitmap.isRecycled()) || this.b1 == null)) {
            Bitmap bitmap2 = this.b1;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Objects.toString(this.b1);
            }
            this.Q0.setVisibility(8);
            this.P0.setVisibility(8);
            this.O0.setImageBitmap(null);
        } else {
            this.Q0.setVisibility(0);
            this.Q0.setImageBitmap(this.b1);
            this.Q0.setBackgroundColor(this.c1);
            this.P0.setVisibility(0);
            Bitmap bitmap3 = this.b1;
            RenderScript renderScriptCreate = RenderScript.create(this.y0);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap3);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            Bitmap bitmapCopy = bitmap3.copy(bitmap3.getConfig(), true);
            allocationCreateTyped.copyTo(bitmapCopy);
            allocationCreateFromBitmap.destroy();
            allocationCreateTyped.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
            this.O0.setImageBitmap(bitmapCopy);
        }
        this.a1 = false;
        this.b1 = null;
        this.c1 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.W0;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.W0;
        CharSequence subtitle = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getSubtitle() : null;
        boolean zIsEmpty = true ^ TextUtils.isEmpty(subtitle);
        if (z) {
            this.R0.setText(title);
        } else {
            this.R0.setText(this.T0);
        }
        if (!zIsEmpty) {
            this.S0.setVisibility(8);
        } else {
            this.S0.setText(subtitle);
            this.S0.setVisibility(0);
        }
    }

    public final void m() {
        ArrayList arrayList = this.u0;
        arrayList.clear();
        ArrayList arrayList2 = this.v0;
        arrayList2.clear();
        ArrayList arrayList3 = this.w0;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.t0.u));
        ch8 ch8Var = this.t0.a;
        ch8Var.getClass();
        eh8.b();
        for (dh8 dh8Var : Collections.unmodifiableList(ch8Var.b)) {
            gaa gaaVarB = this.t0.b(dh8Var);
            if (gaaVarB != null) {
                if (gaaVarB.B()) {
                    arrayList2.add(dh8Var);
                }
                rg8 rg8Var = (rg8) gaaVarB.a;
                if (rg8Var != null && rg8Var.e) {
                    arrayList3.add(dh8Var);
                }
            }
        }
        g(arrayList2);
        g(arrayList3);
        fs4 fs4Var = fs4.X;
        Collections.sort(arrayList, fs4Var);
        Collections.sort(arrayList2, fs4Var);
        Collections.sort(arrayList3, fs4Var);
        this.E0.F();
    }

    public final void n() {
        if (this.A0) {
            if (SystemClock.uptimeMillis() - this.B0 < 300) {
                cy cyVar = this.C0;
                cyVar.removeMessages(1);
                cyVar.sendEmptyMessageAtTime(1, this.B0 + 300);
                return;
            }
            if ((this.H0 != null || this.J0) ? true : !this.z0) {
                this.K0 = true;
                return;
            }
            this.K0 = false;
            if (!this.t0.g() || this.t0.d()) {
                dismiss();
            }
            this.B0 = SystemClock.uptimeMillis();
            this.E0.E();
        }
    }

    public final void o() {
        if (this.K0) {
            n();
        }
        if (this.L0) {
            l();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0 = true;
        this.Y.a(this.s0, this.Z, 1);
        m();
        boolean z = eh8.c;
        i();
    }

    @Override // defpackage.fn, defpackage.ac3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i = 1;
        int i2 = 0;
        super.onCreate(bundle);
        setContentView(syb.mr_cast_dialog);
        Context context = this.y0;
        int i3 = lh8.a;
        getWindow().getDecorView().setBackgroundColor(lt3.a(context, lh8.i(context) ? dtb.mr_dynamic_dialog_background_light : dtb.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(dvb.mr_cast_close_button);
        this.M0 = imageButton;
        imageButton.setColorFilter(-1);
        this.M0.setOnClickListener(new hg8(this, i2));
        Button button = (Button) findViewById(dvb.mr_cast_stop_button);
        this.N0 = button;
        button.setTextColor(-1);
        this.N0.setOnClickListener(new hg8(this, i));
        this.E0 = new ng8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(dvb.mr_cast_list);
        this.D0 = recyclerView;
        recyclerView.setAdapter(this.E0);
        this.D0.setLayoutManager(new LinearLayoutManager());
        this.F0 = new og8(this, i2);
        this.G0 = new HashMap();
        this.I0 = new HashMap();
        this.O0 = (ImageView) findViewById(dvb.mr_cast_meta_background);
        this.P0 = findViewById(dvb.mr_cast_meta_black_scrim);
        this.Q0 = (ImageView) findViewById(dvb.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(dvb.mr_cast_meta_title);
        this.R0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(dvb.mr_cast_meta_subtitle);
        this.S0 = textView2;
        textView2.setTextColor(-1);
        this.T0 = context.getResources().getString(n1c.mr_cast_dialog_title_view_placeholder);
        this.z0 = true;
        k();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0 = false;
        this.Y.f(this.Z);
        this.C0.removeCallbacksAndMessages(null);
        i();
    }
}
