package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class u55 {
    public static final g65[] c;
    public static final g65[][] d;
    public static final HashSet e;
    public final List a;
    public final ByteOrder b;

    static {
        g65[] g65VarArr = {new g65(256, "ImageWidth", 3, 4), new g65(257, "ImageLength", 3, 4), new g65("Make", 271, 2), new g65("Model", 272, 2), new g65("Orientation", 274, 3), new g65("XResolution", 282, 5), new g65("YResolution", 283, 5), new g65("ResolutionUnit", 296, 3), new g65("Software", HttpStatus.SC_USE_PROXY, 2), new g65("DateTime", 306, 2), new g65("YCbCrPositioning", 531, 3), new g65("SubIFDPointer", 330, 4), new g65("ExifIFDPointer", 34665, 4), new g65("GPSInfoIFDPointer", 34853, 4)};
        g65[] g65VarArr2 = {new g65("ExposureTime", 33434, 5), new g65("FNumber", 33437, 5), new g65("ExposureProgram", 34850, 3), new g65("PhotographicSensitivity", 34855, 3), new g65("SensitivityType", 34864, 3), new g65("ExifVersion", 36864, 2), new g65("DateTimeOriginal", 36867, 2), new g65("DateTimeDigitized", 36868, 2), new g65("ComponentsConfiguration", 37121, 7), new g65("ShutterSpeedValue", 37377, 10), new g65("ApertureValue", 37378, 5), new g65("BrightnessValue", 37379, 10), new g65("ExposureBiasValue", 37380, 10), new g65("MaxApertureValue", 37381, 5), new g65("MeteringMode", 37383, 3), new g65("LightSource", 37384, 3), new g65("Flash", 37385, 3), new g65("FocalLength", 37386, 5), new g65("SubSecTime", 37520, 2), new g65("SubSecTimeOriginal", 37521, 2), new g65("SubSecTimeDigitized", 37522, 2), new g65("FlashpixVersion", 40960, 7), new g65("ColorSpace", 40961, 3), new g65(40962, "PixelXDimension", 3, 4), new g65(40963, "PixelYDimension", 3, 4), new g65("InteroperabilityIFDPointer", 40965, 4), new g65("FocalPlaneResolutionUnit", 41488, 3), new g65("SensingMethod", 41495, 3), new g65("FileSource", 41728, 7), new g65("SceneType", 41729, 7), new g65("CustomRendered", 41985, 3), new g65("ExposureMode", 41986, 3), new g65("WhiteBalance", 41987, 3), new g65("SceneCaptureType", 41990, 3), new g65("Contrast", 41992, 3), new g65("Saturation", 41993, 3), new g65("Sharpness", 41994, 3)};
        g65[] g65VarArr3 = {new g65("GPSVersionID", 0, 1), new g65("GPSLatitudeRef", 1, 2), new g65(2, "GPSLatitude", 5, 10), new g65("GPSLongitudeRef", 3, 2), new g65(4, "GPSLongitude", 5, 10), new g65("GPSAltitudeRef", 5, 1), new g65("GPSAltitude", 6, 5), new g65("GPSTimeStamp", 7, 5), new g65("GPSSpeedRef", 12, 2), new g65("GPSTrackRef", 14, 2), new g65("GPSImgDirectionRef", 16, 2), new g65("GPSDestBearingRef", 23, 2), new g65("GPSDestDistanceRef", 25, 2)};
        c = new g65[]{new g65("SubIFDPointer", 330, 4), new g65("ExifIFDPointer", 34665, 4), new g65("GPSInfoIFDPointer", 34853, 4), new g65("InteroperabilityIFDPointer", 40965, 4)};
        d = new g65[][]{g65VarArr, g65VarArr2, g65VarArr3, new g65[]{new g65("InteroperabilityIndex", 1, 2)}};
        e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public u55(ByteOrder byteOrder, ArrayList arrayList) {
        c54.p("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        c54.l(i, wg0.g(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), 0, 4);
        return (Map) this.a.get(i);
    }
}
