package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.au1;
import defpackage.bk4;
import defpackage.c54;
import defpackage.cq7;
import defpackage.d71;
import defpackage.ed3;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.gpc;
import defpackage.j47;
import defpackage.jtb;
import defpackage.khe;
import defpackage.kl2;
import defpackage.kt3;
import defpackage.nse;
import defpackage.o20;
import defpackage.p4d;
import defpackage.p7b;
import defpackage.r48;
import defpackage.s48;
import defpackage.sme;
import defpackage.t48;
import defpackage.tg;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.vl;
import defpackage.vqe;
import defpackage.xp7;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yb4;
import defpackage.yyb;
import defpackage.z2;
import defpackage.zl0;
import java.lang.reflect.Field;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public class MediaBarPreviewLayout extends ConstraintLayout implements t48, nse {
    public static final /* synthetic */ int b1 = 0;
    public final bk4 G0;
    public final View H0;
    public final View I0;
    public final View J0;
    public final RecyclerView K0;
    public final View L0;
    public final ImageButton M0;
    public final ImageButton N0;
    public final ImageButton O0;
    public final ImageButton P0;
    public final MessageComposeEditText Q0;
    public final xp7 R0;
    public final s48 S0;
    public r48 T0;
    public Toast U0;
    public final tg V0;
    public final p7b W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public int a1;

    public MediaBarPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.X0 = false;
        this.Y0 = true;
        this.Z0 = false;
        this.a1 = -1;
        ed3 ed3VarB = vl.b();
        getContext();
        bk4 bk4VarB = bk4.b();
        this.G0 = bk4VarB;
        y8a y8aVar = (y8a) ed3VarB;
        tg tgVarC = y8aVar.c();
        this.V0 = tgVarC;
        xp7 xp7VarJ = y8aVar.j();
        this.R0 = xp7VarJ;
        o20 o20VarD = y8aVar.d();
        this.W0 = y8aVar.n();
        cq7 cq7Var = (cq7) y8aVar.getAccessor().c(cq7.class);
        View.inflate(getContext(), yyb.cl_media_bar_preview_layout, this);
        this.I0 = findViewById(xxb.cl_media_bar_preview_layout__top_panel);
        this.H0 = findViewById(xxb.cl_media_bar_preview_layout__bottom_panel);
        this.J0 = findViewById(xxb.media_bar_view__bottom_shadow);
        this.L0 = findViewById(xxb.cl_media_bar_preview_layout__separator_middle);
        RecyclerView recyclerView = (RecyclerView) findViewById(xxb.cl_media_bar_preview_layout__rv_selected);
        this.K0 = recyclerView;
        ImageButton imageButton = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_send);
        this.M0 = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_file);
        this.N0 = imageButton2;
        ImageButton imageButton3 = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_collage);
        this.O0 = imageButton3;
        ImageButton imageButton4 = (ImageButton) findViewById(xxb.cl_media_bar_preview_layout__ib_cancel);
        this.P0 = imageButton4;
        MessageComposeEditText messageComposeEditText = (MessageComposeEditText) findViewById(xxb.cl_media_bar_preview_layout__edit_message);
        this.Q0 = messageComposeEditText;
        c();
        w();
        recyclerView.setHasFixedSize(true);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(new yb4());
        recyclerView.j(new d71(bk4VarB.b, 4));
        s48 s48Var = new s48(getContext(), this, tgVarC, o20VarD, xp7VarJ, cq7Var);
        this.S0 = s48Var;
        s48Var.A(true);
        recyclerView.setAdapter(this.S0);
        messageComposeEditText.addTextChangedListener(new z2(3, this));
        messageComposeEditText.setInputType(933968);
        new vqe(messageComposeEditText, c54.a(messageComposeEditText.getContext())).a();
        final int i = 0;
        tu0.K(imageButton, 300L, new View.OnClickListener(this) { // from class: q48
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i) {
                    case 0:
                        if (mediaBarPreviewLayout.T0 != null) {
                            if (mediaBarPreviewLayout.X0) {
                                z7d z7dVar = mediaBarPreviewLayout.W0.b;
                                z7dVar.getClass();
                                int iQ = (int) z7dVar.q(PmsKey.f62maxattachcount, 12);
                                if (mediaBarPreviewLayout.R0.f.b() > iQ) {
                                    a14.N(0, mediaBarPreviewLayout.getContext(), are.s(ipc.a, iQ, mediaBarPreviewLayout.getContext()));
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.T0).o0();
                            break;
                        }
                        break;
                    case 1:
                        int i2 = MediaBarPreviewLayout.b1;
                        p4d p4dVar = mediaBarPreviewLayout.R0.f;
                        p4dVar.p(p4dVar.l == 2 ? 1 : 2);
                        mediaBarPreviewLayout.w();
                        p4d p4dVar2 = mediaBarPreviewLayout.R0.f;
                        if (p4dVar2.l != 2) {
                            mediaBarPreviewLayout.y(jpc.H2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(p4dVar2.b() > 1 ? jpc.G2 : jpc.F2);
                            break;
                        }
                    case 2:
                        int i3 = MediaBarPreviewLayout.b1;
                        p4d p4dVar3 = mediaBarPreviewLayout.R0.f;
                        p4dVar3.p(p4dVar3.l != 3 ? 3 : 1);
                        mediaBarPreviewLayout.w();
                        if (mediaBarPreviewLayout.R0.f.l != 3) {
                            mediaBarPreviewLayout.y(jpc.J2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(jpc.E2);
                            break;
                        }
                    default:
                        p4d p4dVar4 = mediaBarPreviewLayout.R0.f;
                        p4dVar4.a.clear();
                        p4dVar4.n();
                        r48 r48Var = mediaBarPreviewLayout.T0;
                        if (r48Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) r48Var;
                            if (tpa.f(actLocalMedias.X0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.Y();
                            } else {
                                actLocalMedias.t0();
                            }
                        }
                        mediaBarPreviewLayout.S0.m();
                        break;
                }
            }
        });
        imageButton.setLongClickable(true);
        imageButton.setOnLongClickListener(new zl0(3, this));
        final int i2 = 1;
        tu0.K(imageButton2, 300L, new View.OnClickListener(this) { // from class: q48
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i2) {
                    case 0:
                        if (mediaBarPreviewLayout.T0 != null) {
                            if (mediaBarPreviewLayout.X0) {
                                z7d z7dVar = mediaBarPreviewLayout.W0.b;
                                z7dVar.getClass();
                                int iQ = (int) z7dVar.q(PmsKey.f62maxattachcount, 12);
                                if (mediaBarPreviewLayout.R0.f.b() > iQ) {
                                    a14.N(0, mediaBarPreviewLayout.getContext(), are.s(ipc.a, iQ, mediaBarPreviewLayout.getContext()));
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.T0).o0();
                            break;
                        }
                        break;
                    case 1:
                        int i22 = MediaBarPreviewLayout.b1;
                        p4d p4dVar = mediaBarPreviewLayout.R0.f;
                        p4dVar.p(p4dVar.l == 2 ? 1 : 2);
                        mediaBarPreviewLayout.w();
                        p4d p4dVar2 = mediaBarPreviewLayout.R0.f;
                        if (p4dVar2.l != 2) {
                            mediaBarPreviewLayout.y(jpc.H2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(p4dVar2.b() > 1 ? jpc.G2 : jpc.F2);
                            break;
                        }
                    case 2:
                        int i3 = MediaBarPreviewLayout.b1;
                        p4d p4dVar3 = mediaBarPreviewLayout.R0.f;
                        p4dVar3.p(p4dVar3.l != 3 ? 3 : 1);
                        mediaBarPreviewLayout.w();
                        if (mediaBarPreviewLayout.R0.f.l != 3) {
                            mediaBarPreviewLayout.y(jpc.J2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(jpc.E2);
                            break;
                        }
                    default:
                        p4d p4dVar4 = mediaBarPreviewLayout.R0.f;
                        p4dVar4.a.clear();
                        p4dVar4.n();
                        r48 r48Var = mediaBarPreviewLayout.T0;
                        if (r48Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) r48Var;
                            if (tpa.f(actLocalMedias.X0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.Y();
                            } else {
                                actLocalMedias.t0();
                            }
                        }
                        mediaBarPreviewLayout.S0.m();
                        break;
                }
            }
        });
        final int i3 = 2;
        tu0.K(imageButton3, 300L, new View.OnClickListener(this) { // from class: q48
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i3) {
                    case 0:
                        if (mediaBarPreviewLayout.T0 != null) {
                            if (mediaBarPreviewLayout.X0) {
                                z7d z7dVar = mediaBarPreviewLayout.W0.b;
                                z7dVar.getClass();
                                int iQ = (int) z7dVar.q(PmsKey.f62maxattachcount, 12);
                                if (mediaBarPreviewLayout.R0.f.b() > iQ) {
                                    a14.N(0, mediaBarPreviewLayout.getContext(), are.s(ipc.a, iQ, mediaBarPreviewLayout.getContext()));
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.T0).o0();
                            break;
                        }
                        break;
                    case 1:
                        int i22 = MediaBarPreviewLayout.b1;
                        p4d p4dVar = mediaBarPreviewLayout.R0.f;
                        p4dVar.p(p4dVar.l == 2 ? 1 : 2);
                        mediaBarPreviewLayout.w();
                        p4d p4dVar2 = mediaBarPreviewLayout.R0.f;
                        if (p4dVar2.l != 2) {
                            mediaBarPreviewLayout.y(jpc.H2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(p4dVar2.b() > 1 ? jpc.G2 : jpc.F2);
                            break;
                        }
                    case 2:
                        int i32 = MediaBarPreviewLayout.b1;
                        p4d p4dVar3 = mediaBarPreviewLayout.R0.f;
                        p4dVar3.p(p4dVar3.l != 3 ? 3 : 1);
                        mediaBarPreviewLayout.w();
                        if (mediaBarPreviewLayout.R0.f.l != 3) {
                            mediaBarPreviewLayout.y(jpc.J2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(jpc.E2);
                            break;
                        }
                    default:
                        p4d p4dVar4 = mediaBarPreviewLayout.R0.f;
                        p4dVar4.a.clear();
                        p4dVar4.n();
                        r48 r48Var = mediaBarPreviewLayout.T0;
                        if (r48Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) r48Var;
                            if (tpa.f(actLocalMedias.X0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.Y();
                            } else {
                                actLocalMedias.t0();
                            }
                        }
                        mediaBarPreviewLayout.S0.m();
                        break;
                }
            }
        });
        final int i4 = 3;
        tu0.K(imageButton4, 300L, new View.OnClickListener(this) { // from class: q48
            public final /* synthetic */ MediaBarPreviewLayout b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b;
                switch (i4) {
                    case 0:
                        if (mediaBarPreviewLayout.T0 != null) {
                            if (mediaBarPreviewLayout.X0) {
                                z7d z7dVar = mediaBarPreviewLayout.W0.b;
                                z7dVar.getClass();
                                int iQ = (int) z7dVar.q(PmsKey.f62maxattachcount, 12);
                                if (mediaBarPreviewLayout.R0.f.b() > iQ) {
                                    a14.N(0, mediaBarPreviewLayout.getContext(), are.s(ipc.a, iQ, mediaBarPreviewLayout.getContext()));
                                    break;
                                }
                            }
                            ((ActLocalMedias) mediaBarPreviewLayout.T0).o0();
                            break;
                        }
                        break;
                    case 1:
                        int i22 = MediaBarPreviewLayout.b1;
                        p4d p4dVar = mediaBarPreviewLayout.R0.f;
                        p4dVar.p(p4dVar.l == 2 ? 1 : 2);
                        mediaBarPreviewLayout.w();
                        p4d p4dVar2 = mediaBarPreviewLayout.R0.f;
                        if (p4dVar2.l != 2) {
                            mediaBarPreviewLayout.y(jpc.H2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(p4dVar2.b() > 1 ? jpc.G2 : jpc.F2);
                            break;
                        }
                    case 2:
                        int i32 = MediaBarPreviewLayout.b1;
                        p4d p4dVar3 = mediaBarPreviewLayout.R0.f;
                        p4dVar3.p(p4dVar3.l != 3 ? 3 : 1);
                        mediaBarPreviewLayout.w();
                        if (mediaBarPreviewLayout.R0.f.l != 3) {
                            mediaBarPreviewLayout.y(jpc.J2);
                            break;
                        } else {
                            mediaBarPreviewLayout.y(jpc.E2);
                            break;
                        }
                    default:
                        p4d p4dVar4 = mediaBarPreviewLayout.R0.f;
                        p4dVar4.a.clear();
                        p4dVar4.n();
                        r48 r48Var = mediaBarPreviewLayout.T0;
                        if (r48Var != null) {
                            ActLocalMedias actLocalMedias = (ActLocalMedias) r48Var;
                            if (tpa.f(actLocalMedias.X0, "SELECTED_MEDIA_ALBUM")) {
                                actLocalMedias.Y();
                            } else {
                                actLocalMedias.t0();
                            }
                        }
                        mediaBarPreviewLayout.S0.m();
                        break;
                }
            }
        });
    }

    public final void A() {
        boolean z = true;
        boolean z2 = this.W0.c.u() && !this.Y0;
        this.Y0 = false;
        xp7 xp7Var = this.R0;
        int iB = xp7Var.f.b();
        View view = this.I0;
        if (iB == 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            int i = this.a1;
            if (i != -1 && i < iB) {
                this.K0.B0(iB - 1);
            }
        }
        this.a1 = iB;
        boolean z3 = this.X0;
        p4d p4dVar = xp7Var.f;
        ImageButton imageButton = this.N0;
        ImageButton imageButton2 = this.O0;
        if (z3) {
            imageButton2.setVisibility(8);
            imageButton.setVisibility(8);
            B(p4dVar.b() > 0);
        } else {
            this.M0.setVisibility(0);
            int iB2 = p4dVar.b();
            boolean z4 = iB2 > 1;
            tg tgVar = this.V0;
            if (z2) {
                if (z4) {
                    tgVar.a(imageButton2);
                } else {
                    tgVar.c(imageButton2);
                }
            } else if (z4) {
                imageButton2.setVisibility(0);
            } else {
                imageButton2.setVisibility(8);
            }
            if (!this.Z0 && iB2 <= 0) {
                z = false;
            }
            if (z2) {
                if (z) {
                    tgVar.a(imageButton);
                } else {
                    tgVar.c(imageButton);
                }
            } else if (z) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
        }
        CharSequence charSequence = p4dVar.k;
        if (charSequence != null) {
            this.Q0.setText(charSequence);
        }
        w();
        this.S0.m();
    }

    public final void B(boolean z) {
        Editable text = this.Q0.getText();
        this.M0.setVisibility((z || !TextUtils.isEmpty(text != null ? text.toString().trim() : null)) ? 0 : 8);
    }

    @Override // defpackage.nse
    public final void c() {
        Context context = getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        setBackgroundColor(0);
        this.K0.setBackgroundColor(smeVarR.m);
        View view = this.I0;
        int i = smeVarR.m;
        view.setBackgroundColor(i);
        this.H0.setBackgroundColor(i);
        this.L0.setBackgroundColor(smeVarR.K);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageButton imageButton = this.M0;
        int i2 = smeVarR.k;
        imageButton.setColorFilter(i2, mode);
        imageButton.setBackground(smeVarR.a());
        ti3 ti3Var = (ti3) imageButton.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) ti3Var).width = -2;
        imageButton.setLayoutParams(ti3Var);
        j47.U(imageButton, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageButton.getLayoutParams();
        if (marginLayoutParams.bottomMargin != 0) {
            marginLayoutParams.bottomMargin = 0;
            imageButton.setLayoutParams(marginLayoutParams);
        }
        RippleDrawable rippleDrawableA = smeVarR.a();
        ImageButton imageButton2 = this.N0;
        imageButton2.setBackground(rippleDrawableA);
        RippleDrawable rippleDrawableA2 = smeVarR.a();
        ImageButton imageButton3 = this.O0;
        imageButton3.setBackground(rippleDrawableA2);
        int i3 = smeVarR.w;
        imageButton2.setColorFilter(i3, mode);
        imageButton3.setColorFilter(i3, mode);
        ImageButton imageButton4 = this.P0;
        imageButton4.setColorFilter(i3, mode);
        imageButton4.setBackground(smeVarR.a());
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(smeVarR.i), i != 0 ? new ColorDrawable(i) : null, null);
        rippleDrawable.setRadius(this.G0.n);
        imageButton4.setBackground(rippleDrawable);
        MessageComposeEditText messageComposeEditText = this.Q0;
        messageComposeEditText.setTextColor(smeVarR.F);
        messageComposeEditText.setHintTextColor(smeVarR.M);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i4 = declaredField.getInt(messageComposeEditText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(messageComposeEditText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable drawableB = kt3.b(messageComposeEditText.getContext(), i4);
            drawableB.setColorFilter(new PorterDuffColorFilter(i2, mode));
            Drawable drawableB2 = kt3.b(messageComposeEditText.getContext(), i4);
            drawableB2.setColorFilter(new PorterDuffColorFilter(i2, mode));
            declaredField3.set(obj, new Drawable[]{drawableB, drawableB2});
        } catch (Throwable unused) {
        }
    }

    public int getBottomShadowHeight() {
        return this.J0.getHeight();
    }

    public int getContentHeight() {
        MessageComposeEditText messageComposeEditText = this.Q0;
        int measuredHeight = messageComposeEditText.getVisibility() == 0 ? messageComposeEditText.getMeasuredHeight() : 0;
        View view = this.I0;
        if (view.getVisibility() == 0) {
            measuredHeight += view.getMeasuredHeight();
        }
        int paddingBottom = getPaddingBottom();
        this.G0.getClass();
        if (paddingBottom < fk4.b((int) 200.0f)) {
            measuredHeight += getPaddingBottom();
        }
        return getPaddingTop() + measuredHeight;
    }

    public int getHeightWithoutShadow() {
        return getHeight() - this.J0.getHeight();
    }

    public Pair<Integer, Integer> getScrollPosition() {
        LinearLayoutManager linearLayoutManager;
        int iW0;
        View viewR;
        RecyclerView recyclerView = this.K0;
        return (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager) || recyclerView.getWidth() == 0 || (viewR = linearLayoutManager.r((iW0 = (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()).W0()))) == null) ? new Pair<>(0, 0) : new Pair<>(Integer.valueOf(iW0), Integer.valueOf(viewR.getLeft() - (this.G0.i / 2)));
    }

    public void setAnimojisEnabled(boolean z) {
        MessageComposeEditText messageComposeEditText = this.Q0;
        if (messageComposeEditText != null) {
            messageComposeEditText.setAnimojiEnabled(z);
        }
    }

    public void setChatMode(kl2 kl2Var) {
        int i = ((Boolean) kl2Var.a.getValue()).booleanValue() ? gpc.f0 : gpc.W;
        ImageButton imageButton = this.M0;
        imageButton.setImageResource(i);
        imageButton.setLongClickable(((Boolean) kl2Var.a.getValue()).booleanValue());
    }

    public void setFullScreen(boolean z) {
        this.Z0 = z;
        A();
        c();
    }

    public void setListener(r48 r48Var) {
        this.T0 = r48Var;
    }

    public void setMessageEdit(boolean z) {
        this.X0 = z;
        A();
        c();
    }

    public void setShouldApplyHighlight(boolean z) {
        this.S0.u0 = z;
    }

    public final void w() {
        int iS = au1.s(this.R0.f.l);
        ImageButton imageButton = this.N0;
        ImageButton imageButton2 = this.O0;
        if (iS == 1) {
            imageButton2.setImageResource(gpc.s);
            imageButton.setImageResource(gpc.B);
        } else if (iS != 2) {
            imageButton2.setImageResource(gpc.s);
            imageButton.setImageResource(gpc.A);
        } else {
            imageButton2.setImageResource(gpc.t);
            imageButton.setImageResource(gpc.A);
        }
    }

    public final void x(int i) {
        RecyclerView recyclerView = this.K0;
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager) || recyclerView.getWidth() == 0) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        View childAt = recyclerView.getChildAt(i);
        linearLayoutManager.n1(i, Math.max(0, (recyclerView.getWidth() / 2) - ((childAt != null ? childAt.getWidth() : getContext().getResources().getDimensionPixelOffset(jtb.compose_view_item_height) - this.G0.i) / 2)));
    }

    public final void y(int i) throws Resources.NotFoundException {
        Toast toast = this.U0;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(getContext(), i, 0);
        this.U0 = toastMakeText;
        toastMakeText.show();
    }
}
