package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class le8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPickerScreen b;

    public /* synthetic */ le8(MediaPickerScreen mediaPickerScreen, int i) {
        this.a = i;
        this.b = mediaPickerScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        View viewFindViewById;
        int i = 0;
        MediaPickerScreen mediaPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MediaPickerScreen.B0;
                if (!(((te8) mediaPickerScreen.s0.getValue()).w0.a.getValue() instanceof gt3)) {
                    bc7[] bc7VarArr2 = MediaPickerScreen.B0;
                    bc7 bc7Var = bc7VarArr2[3];
                    ((w12) mediaPickerScreen.u0.getValue()).setVisibility(0);
                    bc7 bc7Var2 = bc7VarArr2[7];
                    ((View) mediaPickerScreen.y0.getValue()).setVisibility(0);
                    bc7 bc7Var3 = bc7VarArr2[2];
                    q7c q7cVar = mediaPickerScreen.t0;
                    j03 j03Var = (j03) q7cVar.T0(mediaPickerScreen, bc7Var3);
                    if (!tpa.f(j03Var.c(), "SELECT_ALBUM_WIDGET_TAG")) {
                        coc cocVar = new coc(new SelectAlbumWidget(mediaPickerScreen.c, null), null, null, null, false, -1);
                        cocVar.d("SELECT_ALBUM_WIDGET_TAG");
                        j03Var.a.R(cocVar);
                    }
                    uu3 uu3VarB = ((j03) q7cVar.T0(mediaPickerScreen, bc7VarArr2[2])).b();
                    SelectAlbumWidget selectAlbumWidget = uu3VarB instanceof SelectAlbumWidget ? (SelectAlbumWidget) uu3VarB : null;
                    if (selectAlbumWidget != null) {
                        View view = selectAlbumWidget.getView();
                        if (view != null && (viewFindViewById = view.findViewById(fga.d)) != null) {
                            int height = viewFindViewById.getHeight();
                            bc7 bc7Var4 = bc7VarArr2[4];
                            mediaPickerScreen.v0.b(mediaPickerScreen, Integer.valueOf(height));
                            v3c.y(new a3(3, null, 2), viewFindViewById);
                        }
                        selectAlbumWidget.p0();
                    }
                }
                return e5f.a;
            case 1:
                bc7[] bc7VarArr3 = MediaPickerScreen.B0;
                return new q3d((hq7) he8.a.getAccessor().c(hq7.class), new e3d(mediaPickerScreen.n0().s0, false));
            case 2:
                bc7[] bc7VarArr4 = MediaPickerScreen.B0;
                return new te8(mediaPickerScreen.n0(), (q3d) mediaPickerScreen.Z.getValue(), (s86) mediaPickerScreen.Y.getValue());
            case 3:
                bc7[] bc7VarArr5 = MediaPickerScreen.B0;
                w12 w12Var = new w12(mediaPickerScreen.getContext());
                w12Var.setId(cda.a);
                w12Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                w12Var.setVisibility(8);
                return w12Var;
            case 4:
                bc7[] bc7VarArr6 = MediaPickerScreen.B0;
                w12 w12Var2 = new w12(mediaPickerScreen.getContext());
                w12Var2.setId(cda.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                w12Var2.setLayoutParams(layoutParams);
                return w12Var2;
            case 5:
                bc7[] bc7VarArr7 = MediaPickerScreen.B0;
                cla claVar = new cla(mediaPickerScreen.getContext(), 6);
                claVar.setId(cda.e);
                claVar.setTitle(dda.a);
                claVar.setLeftActions(new kka(new wz7(2, mediaPickerScreen)));
                claVar.setTitleClickListener(new le8(mediaPickerScreen, i));
                claVar.setShowDropdown(true);
                return claVar;
            case 6:
                bc7[] bc7VarArr8 = MediaPickerScreen.B0;
                View view2 = new View(mediaPickerScreen.getContext());
                view2.setId(cda.d);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(1 * fk4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 48;
                view2.setLayoutParams(layoutParams2);
                v3c.y(new a3(3, null, 1), view2);
                view2.setVisibility(8);
                return view2;
            default:
                bc7[] bc7VarArr9 = MediaPickerScreen.B0;
                TextView textView = new TextView(mediaPickerScreen.getContext());
                textView.setText(dda.c);
                i4f.s.b(textView, du4.b);
                textView.setGravity(17);
                v3c.y(new v9(3, null, 17), textView);
                ((FrameLayout) mediaPickerScreen.z0.T0(mediaPickerScreen, MediaPickerScreen.B0[8])).addView(textView);
                return textView;
        }
    }
}
