package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;

/* loaded from: classes2.dex */
public final class lz1 implements CameraVideoCapturer.CaptureFormatHelper {
    public final a4c a;

    public /* synthetic */ lz1(a4c a4cVar) {
        this.a = a4cVar;
    }

    public ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(bg1.a(string));
            } catch (Throwable th) {
                this.a.logException("ParticipantParser", wg0.i("Can't parse id ", string), th);
            }
        }
        return arrayList;
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List list, int i) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = super.getClosestSupportedFramerateRange(list, i);
        String strConcat = "available fps ranges are ".concat(x53.n0(list, ", ", null, null, null, 62));
        a4c a4cVar = this.a;
        a4cVar.log("CaptureFormatHelper", strConcat);
        a4cVar.log("CaptureFormatHelper", "closest frame rate range for requested " + i + " is " + closestSupportedFramerateRange);
        return closestSupportedFramerateRange;
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public Size getClosestSupportedSize(List list, int i, int i2) {
        Size closestSupportedSize = super.getClosestSupportedSize(list, i, i2);
        String strConcat = "available frame sizes are ".concat(x53.n0(list, ", ", null, null, null, 62));
        a4c a4cVar = this.a;
        a4cVar.log("CaptureFormatHelper", strConcat);
        a4cVar.log("CaptureFormatHelper", "closest frame size range for requested " + i + "x" + i2 + " is " + closestSupportedSize);
        return closestSupportedSize;
    }
}
