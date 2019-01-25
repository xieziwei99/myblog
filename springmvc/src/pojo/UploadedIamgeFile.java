package pojo;

import org.springframework.web.multipart.MultipartFile;

public class UploadedIamgeFile {

	MultipartFile image;		// image必须与<input type="file" name="image" accept="image/*">保持一致

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
}
