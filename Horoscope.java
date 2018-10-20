import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String star = JOptionPane.showInputDialog(null,
				"tell me your zodiac sign, to find out, go to this link     https://www.horoscopedates.com/zodiac-signs/");
		if (star.toLowerCase().equals("aries")) {
			JOptionPane.showMessageDialog(null, " you are:Courageous, energetic, willful, commanding, leading.");
		} else if (star.toLowerCase().equals("taurus")) {
			JOptionPane.showMessageDialog(null,
					" You are:Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		} else if (star.toLowerCase().equals("gemini")) {
			JOptionPane.showMessageDialog(null,
					"you are:Cerebral, chatty, loves learning and education, charming, and adventurous.");
		} else if (star.toLowerCase().equals("cancer")) {
			JOptionPane.showMessageDialog(null, "You are:Emotional, group oriented, seeks security, family.");
		} else if (star.toLowerCase().equals("leo")) {
			JOptionPane.showMessageDialog(null, "you are:Generous, organized, protective, beautiful.");
		} else if (star.toLowerCase().equals("virigo")) {
			JOptionPane.showMessageDialog(null, "you are:Particular, logical, practical, sense of duty, critical.");
		} else if (star.toLowerCase().equals("libra")) {
			JOptionPane.showMessageDialog(null, "you are:Balanced, seeks beauty, sense of justice.");
		} else if (star.toLowerCase().equals("scorpio")) {
			JOptionPane.showMessageDialog(null, "you are:Passionate, exacting, loves extremes, combative, reflective.");
		} else if (star.toLowerCase().equals("sagitarius")) {
			JOptionPane.showConfirmDialog(null, "Happy, absent minded, creative, adventurous.");
		} else if (star.toLowerCase().equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "you are:Timeless, driven, calculating, ambitious.");
		} else if (star.toLowerCase().equals("aquarius")) {
			JOptionPane.showMessageDialog(null,
					"you are:Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		} else if (star.toLowerCase().equals("pisces")) {
			JOptionPane.showMessageDialog(null, "you are:Likeable, energetic, passionate, sensitive.");
		} else {
			JOptionPane.showMessageDialog(null, "THats not a horocope", title, messageType);
		}
	}
}
// #HOOOOOOOOOOOOOOOOOOOOORRRO SCOPE !!!!!!!!!!!!!