package defpackage;

import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final /* synthetic */ class sq1 extends ni9 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.a = i2;
    }

    @Override // defpackage.ni9, defpackage.zb7
    public final Object get() {
        switch (this.a) {
            case 0:
                CameraManager cameraManagerA = ((r21) this.receiver).a();
                boolean z = false;
                if (cameraManagerA != null && cameraManagerA.isCameraEnabled()) {
                    z = true;
                }
                break;
        }
        return ((hi9) this.receiver).d;
    }

    @Override // defpackage.ni9, defpackage.vb7
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                r21 r21Var = (r21) this.receiver;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                CameraManager cameraManagerA = r21Var.a();
                if (cameraManagerA != null) {
                    cameraManagerA.setCameraEnabled(zBooleanValue);
                    break;
                }
                break;
            case 1:
                ((hi9) this.receiver).a = (rd8) obj;
                break;
            case 2:
                ((hi9) this.receiver).c = (rd8) obj;
                break;
            case 3:
                ((hi9) this.receiver).b = (rd8) obj;
                break;
            case 4:
                ((hi9) this.receiver).a = (rd8) obj;
                break;
            case 5:
                ((hi9) this.receiver).b = (rd8) obj;
                break;
            case 6:
                ((hi9) this.receiver).c = (rd8) obj;
                break;
            case 7:
                ((hi9) this.receiver).d = (rd8) obj;
                break;
            case 8:
                ((hi9) this.receiver).a = (rd8) obj;
                break;
            case 9:
                ((hi9) this.receiver).b = (rd8) obj;
                break;
            case 10:
                ((hi9) this.receiver).c = (rd8) obj;
                break;
            case 11:
                ((hi9) this.receiver).d = (rd8) obj;
                break;
            default:
                ((hi9) this.receiver).d = (rd8) obj;
                break;
        }
    }
}
