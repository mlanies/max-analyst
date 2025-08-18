package defpackage;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class e10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ e10(int i) {
        this.a = i;
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = v3c.c;
                break;
            case 1:
                dialogInterface.cancel();
                break;
            case 2:
                break;
            default:
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    break;
                }
                break;
        }
    }
}
