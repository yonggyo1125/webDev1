package controllers.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file/upload")
public class FileUploadController {

    @GetMapping
    public String upload() {

        return "file/upload";
    }

    @PostMapping
    public String uploadPs(MultipartFile file) {

        return "file/upload";
    }
}
