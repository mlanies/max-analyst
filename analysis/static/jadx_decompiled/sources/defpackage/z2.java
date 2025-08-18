package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.devmenu.utils.LongValueBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* loaded from: classes.dex */
public final class z2 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void g(Editable editable) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 3:
                MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) this.b;
                r48 r48Var = mediaBarPreviewLayout.T0;
                if (r48Var != null && editable != null) {
                    ((ActLocalMedias) r48Var).m0().f.k = editable;
                }
                if (mediaBarPreviewLayout.X0) {
                    mediaBarPreviewLayout.B(mediaBarPreviewLayout.R0.f.b() > 0);
                    break;
                }
                break;
            case 5:
                eha ehaVar = (eha) this.b;
                ehaVar.o = editable;
                je7 je7Var = ehaVar.F0;
                if (je7Var.a()) {
                    ((View) je7Var.getValue()).setVisibility(true ^ (editable == null || editable.length() == 0) ? 0 : 8);
                }
                bha bhaVar = ehaVar.u0;
                if (bhaVar != null) {
                    bhaVar.I(editable);
                    break;
                }
                break;
            case 6:
                CharSequence charSequenceSubSequence = editable != null ? editable.subSequence(0, editable.length()) : null;
                if (charSequenceSubSequence == null) {
                    charSequenceSubSequence = "";
                }
                ((m56) this.b).invoke(charSequenceSubSequence);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        eaa eaaVar;
        String str;
        String strE;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                txa txaVarV0 = ((AbstractPickerScreen) obj).v0();
                String string = charSequence != null ? charSequence.toString() : null;
                txaVarV0.getClass();
                if (string == null) {
                    string = "";
                }
                txaVarV0.t0.m(null, string);
                break;
            case 1:
                bc7[] bc7VarArr = LogsViewerScreen.Y;
                mv7 mv7VarM0 = ((LogsViewerScreen) obj).m0();
                if (charSequence != null) {
                    mv7VarM0.getClass();
                    if (!w9e.C0(charSequence)) {
                        mv7VarM0.t0.o1(mv7VarM0, mv7.v0[0], j47.S(mv7VarM0.a, ((w9a) mv7VarM0.c).b(), vx3.b, new lv7(mv7VarM0, charSequence, null)));
                        mv7VarM0.q();
                        break;
                    }
                }
                mv7VarM0.getClass();
                mv7VarM0.t0.o1(mv7VarM0, mv7.v0[0], null);
                mv7VarM0.s0.m(null, nz4.a);
                break;
            case 2:
                bc7[] bc7VarArr2 = LongValueBottomSheet.D0;
                LongValueBottomSheet longValueBottomSheet = (LongValueBottomSheet) obj;
                longValueBottomSheet.getClass();
                ((OneMeButton) longValueBottomSheet.C0.T0(longValueBottomSheet, LongValueBottomSheet.D0[4])).setEnabled(!(charSequence == null || charSequence.length() == 0));
                break;
            case 3:
                break;
            case 4:
                if (i3 > 1) {
                    lea leaVar = (lea) obj;
                    if (!leaVar.s0 && (eaaVar = leaVar.c) != null && (str = eaaVar.a) != null) {
                        String strValueOf = String.valueOf(charSequence);
                        kea phoneFormatterProvider = leaVar.getPhoneFormatterProvider();
                        if (phoneFormatterProvider != null && (strE = phoneFormatterProvider.e(str, strValueOf)) != null) {
                            strValueOf = strE;
                        }
                        EditText editText = leaVar.w0;
                        editText.removeTextChangedListener(leaVar.x0);
                        leaVar.setText(strValueOf);
                        editText.addTextChangedListener(leaVar.x0);
                        break;
                    }
                }
                break;
            case 5:
            case 6:
                break;
            case 7:
                ((o0d) obj).onTextChanged(charSequence);
                break;
            case 8:
                bc7[] bc7VarArr3 = ServerHostBottomSheet.G0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                ((OneMeButton) serverHostBottomSheet.F0.T0(serverHostBottomSheet, ServerHostBottomSheet.G0[4])).setEnabled(!(charSequence == null || charSequence.length() == 0));
                break;
            default:
                bc7[] bc7VarArr4 = ServerPortBottomSheet.B0;
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj;
                serverPortBottomSheet.getClass();
                ((OneMeButton) serverPortBottomSheet.A0.T0(serverPortBottomSheet, ServerPortBottomSheet.B0[1])).setEnabled(!(charSequence == null || charSequence.length() == 0));
                break;
        }
    }
}
