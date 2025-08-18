package defpackage;

import androidx.media3.common.PlaybackException;

/* loaded from: classes.dex */
public final /* synthetic */ class t98 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ t98(int i, PlaybackException playbackException) {
        this.a = i;
        this.b = playbackException;
    }

    @Override // defpackage.km7
    public final void invoke(Object obj) {
        n3b n3bVar = (n3b) obj;
        switch (this.a) {
            case 0:
                n3bVar.r0(this.b);
                break;
            case 1:
                n3bVar.x0(this.b);
                break;
            case 2:
                n3bVar.r0(this.b);
                break;
            default:
                n3bVar.x0(this.b);
                break;
        }
    }
}
